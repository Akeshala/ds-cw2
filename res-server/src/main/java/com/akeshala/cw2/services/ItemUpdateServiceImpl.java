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

public class ItemUpdateServiceImpl extends ItemUpdateServiceGrpc.ItemUpdateServiceImplBase implements DistributedTxListener {

    ItemUpdateServiceGrpc.ItemUpdateServiceBlockingStub clientStub = null;
    private ManagedChannel channel = null;
    private final ReservationServer server;
    private final DataProviderImpl dataProvider;
    private boolean status = false;
    private String statusMessage = "";
    private AbstractMap.SimpleEntry<String, ItemUpdateRequest> tempDataHolder;
    public ItemUpdateServiceImpl(ReservationServer reservationServer, DataProviderImpl dataProvider) {
        this.server = reservationServer;
        this.dataProvider = dataProvider;
    }

    @Override
    public void onGlobalCommit() {

        updateItem();
    }

    @Override
    public void onGlobalAbort() {
        tempDataHolder = null;
        status = false;
        System.out.println("Global Abort");
    }

    @Override
    public synchronized void updateItem(ItemUpdateRequest request, StreamObserver<ItemUpdateResponse> responseObserver) {
        try {
            if (server.isLeader()) {
                startDistributedTx(request.getItemId(), request);
                updateSecondaryServers(request);
                if (checkEligibility(request)){
                    ((DistributedTxCoordinator) server.getTransactionItemUpdate()).perform();
                } else {
                    ((DistributedTxCoordinator) server.getTransactionItemUpdate()).sendGlobalAbort();
                }
            } else {
                if (request.getIsSentByPrimary()) {
                    startDistributedTx(request.getItemId(), request);
                    if (checkEligibility(request)) {
                        ((DistributedTxParticipant) server.getTransactionItemUpdate()).voteCommit();
                    } else {
                        ((DistributedTxParticipant) server.getTransactionItemUpdate()).voteAbort();
                    }
                } else {
                    ItemUpdateResponse response = callPrimary(request);
                    if (response.getStatus()) {
                        status = true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            e.printStackTrace();
        }

        ItemUpdateResponse response = ItemUpdateResponse.newBuilder().setStatus(status).setMessage(statusMessage).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private void startDistributedTx(String itemId, ItemUpdateRequest itemUpdateRequest) {
        try {
            server.getTransactionItemUpdate().start("update"+ itemId, String.valueOf(UUID.randomUUID()));
            tempDataHolder = new AbstractMap.SimpleEntry<>(itemId, itemUpdateRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ItemUpdateResponse callServer(
            ItemUpdateRequest itemUpdateRequest,
            boolean isSentByPrimary,
            String IPAddress,
            int port
    ) {
        System.out.println(IPAddress + ":" + port);
        channel = ManagedChannelBuilder.forAddress(IPAddress, port).usePlaintext().build();

        clientStub = ItemUpdateServiceGrpc.newBlockingStub(channel);

        ItemUpdateRequest request = itemUpdateRequest.toBuilder().setIsSentByPrimary(isSentByPrimary).build();

        ItemUpdateResponse response = clientStub.updateItem(request);
        return response;
    }

    private ItemUpdateResponse callPrimary(ItemUpdateRequest itemUpdateRequest) {
        String[] currentLeaderData = server.getLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServer(itemUpdateRequest, false, IPAddress, port);
    }

    private void updateSecondaryServers(ItemUpdateRequest itemUpdateRequest) throws KeeperException, InterruptedException {
        List<String[]> othersData = server.getSecondaryData();
        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(itemUpdateRequest, true, IPAddress, port);
        }
    }

    private boolean checkEligibility(ItemUpdateRequest request) {
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

    private void updateItem() {
        if (tempDataHolder != null) {
            ItemUpdateRequest request = tempDataHolder.getValue();
            dataProvider.updateItem(request);
            System.out.println("Item " + request.getItemId() + " Updated & committed");
            status = false;
            statusMessage = "Item Updated Successfully";
            tempDataHolder = null;
        }
    }
}
