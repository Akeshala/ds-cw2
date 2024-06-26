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

public class ItemDeleteServiceImpl extends ItemDeleteServiceGrpc.ItemDeleteServiceImplBase implements DistributedTxListener {

    ItemDeleteServiceGrpc.ItemDeleteServiceBlockingStub clientStub = null;
    private ManagedChannel channel = null;
    private final ReservationServer server;
    private final DataProviderImpl dataProvider;
    private boolean status = false;
    private String statusMessage = "";
    private AbstractMap.SimpleEntry<String, ItemDeleteRequest> tempDataHolder;

    public ItemDeleteServiceImpl(ReservationServer reservationServer, DataProviderImpl dataProvider) {
        this.server = reservationServer;
        this.dataProvider = dataProvider;
    }

    @Override
    public void onGlobalCommit() {
        deleteItem();
    }

    @Override
    public void onGlobalAbort() {
        tempDataHolder = null;
        status = false;
        System.out.println("Global Abort");
    }

    @Override
    public synchronized void deleteItem(ItemDeleteRequest request, StreamObserver<ItemDeleteResponse> responseObserver) {
        try {
            if (server.isLeader()) {
                startDistributedTx(request.getItemId(), request);
                updateSecondaryServers(request);
                System.out.println("going to perform");
                if (checkEligibility(request)){
                    ((DistributedTxCoordinator) server.getTransactionItemDelete()).perform();
                } else {
                    ((DistributedTxCoordinator) server.getTransactionItemDelete()).sendGlobalAbort();
                }
            } else {
                if (request.getIsSentByPrimary()) {
                    startDistributedTx(request.getItemId(), request);
                    if (checkEligibility(request)) {
                        ((DistributedTxParticipant) server.getTransactionItemDelete()).voteCommit();
                    } else {
                        ((DistributedTxParticipant) server.getTransactionItemDelete()).voteAbort();
                    }
                } else {
                    ItemDeleteResponse response = callPrimary(request);
                    if (response.getStatus()) {
                        status = true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }

        ItemDeleteResponse response = ItemDeleteResponse.newBuilder().setStatus(status).setMessage(statusMessage).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private boolean checkEligibility(ItemDeleteRequest request) {
        if (!dataProvider.isUserExist(request.getSellerName())) {
            statusMessage = "Seller does not exist";
            status = false;
            return false;
        }
        if (!dataProvider.isItemExist(request.getItemId())) {
            statusMessage = "Item does not exist";
            status = false;
            return false;
        }
        return true;
    }

    private void deleteItem() {
        if (tempDataHolder != null) {
            ItemDeleteRequest request = tempDataHolder.getValue();
            dataProvider.deleteItem(request.getItemId());
            status = true;
            statusMessage = "Item deleted";
            tempDataHolder = null;
        }
    }

    private ItemDeleteResponse callServer(
            ItemDeleteRequest itemDeleteRequest,
            boolean isSentByPrimary,
            String IPAddress,
            int port
    ) {
        System.out.println(IPAddress + ":" + port);
        channel = ManagedChannelBuilder.forAddress(IPAddress, port)
                .usePlaintext()
                .build();
        clientStub = ItemDeleteServiceGrpc.newBlockingStub(channel);
        ItemDeleteRequest request = itemDeleteRequest.toBuilder()
                .setIsSentByPrimary(isSentByPrimary)
                .build();
        ItemDeleteResponse response = clientStub.deleteItem(request);
        return response;
    }

    private ItemDeleteResponse callPrimary(ItemDeleteRequest itemDeleteRequest) {
        String[] currentLeaderData = server.getLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServer(itemDeleteRequest, false, IPAddress, port);
    }

    private void updateSecondaryServers(ItemDeleteRequest itemDeleteRequest) throws KeeperException, InterruptedException {
        List<String[]> othersData = server.getSecondaryData();
        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(itemDeleteRequest, true, IPAddress, port);
        }
    }

    private void startDistributedTx(String itemId, ItemDeleteRequest itemDeleteRequest) {
        try {
            server.getTransactionItemDelete().start("delete" + itemId, String.valueOf(UUID.randomUUID()));
            tempDataHolder = new AbstractMap.SimpleEntry<>(itemId, itemDeleteRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
