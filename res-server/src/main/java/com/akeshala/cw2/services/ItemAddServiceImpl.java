package com.akeshala.cw2.services;

import com.akeshala.cw2.ReservationServer;
import com.akeshala.cw2.sync.DistributedTxCoordinator;
import com.akeshala.cw2.sync.DistributedTxListener;
import com.akeshala.cw2.sync.DistributedTxParticipant;
import com.akeshala.cw2.grpc.generated.*;
import com.akeshala.cw2.utils.DataProviderImpl;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.List;
import java.util.UUID;

public class ItemAddServiceImpl extends ItemAddServiceGrpc.ItemAddServiceImplBase implements DistributedTxListener {
    ItemAddServiceGrpc.ItemAddServiceBlockingStub clientStub = null;
    private ManagedChannel channel = null;
    private final ReservationServer server;
    private final DataProviderImpl dataProvider;
    private boolean status = false;
    private String statusMessage = "";
    private AbstractMap.SimpleEntry<String, ItemAddRequest> tempDataHolder;

    public ItemAddServiceImpl(ReservationServer reservationServer, DataProviderImpl dataProvider) {
        this.server = reservationServer;
        this.dataProvider = dataProvider;
    }

    @Override
    public void onGlobalCommit() {
        persistItem();
    }

    @Override
    public void onGlobalAbort() {
        tempDataHolder = null;
        status = false;
        System.out.println("Global Abort");
    }

    @Override
    public synchronized void addItem(ItemAddRequest request, StreamObserver<ItemAddResponse> responseObserver) {
        try {
            if (server.isLeader()) {
                try {
                    startDistributedTx(request.getItemId(), request);
                    updateSecondaryServers(request);
                    if (checkEligibility(request)){
                        ((DistributedTxCoordinator) server.getTransactionItemAdd()).perform();
                    } else {
                        ((DistributedTxCoordinator) server.getTransactionItemAdd()).sendGlobalAbort();
                    }
                } catch (Exception e) {
                    System.out.println("Error " + e.getMessage());
                    e.printStackTrace();
                }
            } else {
                if (request.getIsSentByPrimary()) {
                    startDistributedTx(request.getItemId(), request);
                    if (checkEligibility(request)) {
                        ((DistributedTxParticipant) server.getTransactionItemAdd()).voteCommit();
                    } else {
                        ((DistributedTxParticipant) server.getTransactionItemAdd()).voteAbort();
                    }
                } else {
                    ItemAddResponse response = callPrimary(request);
                    if (response.getStatus()) {
                        status = true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }

        ItemAddResponse response = ItemAddResponse.newBuilder().setStatus(status).setMessage(statusMessage).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private boolean checkEligibility(ItemAddRequest request) {
        if (!dataProvider.isUserExist(request.getSellerName())) {
            statusMessage = "Seller not found";
            status = false;
            return false;
        }
        User seller = dataProvider.getUser(request.getSellerName());
        if ((seller.getRole() == Role.INVENTORY_CLERK && request.getType() != Type.NEW_ARRIVAL)
        || (seller.getRole() != Role.INVENTORY_CLERK && request.getType() == Type.NEW_ARRIVAL)) {
            statusMessage = "Conflicting role";
            status = false;
            return false;
        }
        return true;
    }

    private void persistItem() {
        if (tempDataHolder != null) {
            ItemAddRequest request = tempDataHolder.getValue();
            dataProvider.addItem(request);
            status = true;
            statusMessage = "Item added";
            tempDataHolder = null;
        }
    }

    private ItemAddResponse callServer(
            ItemAddRequest itemAddRequest,
            boolean isSentByPrimary,
            String IPAddress,
            int port
    ) {
        System.out.println(IPAddress + ":" + port);

        channel = ManagedChannelBuilder.forAddress(IPAddress, port).usePlaintext().build();
        clientStub = ItemAddServiceGrpc.newBlockingStub(channel);

        ItemAddRequest request = itemAddRequest.toBuilder().setIsSentByPrimary(isSentByPrimary).build();

        ItemAddResponse response = clientStub.addItem(request);
        return response;
    }

    private ItemAddResponse callPrimary(ItemAddRequest itemAddRequest) {
        String[] currentLeaderData = server.getLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServer(itemAddRequest, false, IPAddress, port);
    }

    private void updateSecondaryServers(ItemAddRequest itemAddRequest) throws KeeperException, InterruptedException {
        List<String[]> othersData = server.getSecondaryData();
        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(itemAddRequest, true, IPAddress, port);
        }
    }

    private void startDistributedTx(String itemId, ItemAddRequest itemAddRequest) {
        try {
            server.getTransactionItemAdd().start(itemId, String.valueOf(UUID.randomUUID()));
            tempDataHolder = new AbstractMap.SimpleEntry<>(itemId, itemAddRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
