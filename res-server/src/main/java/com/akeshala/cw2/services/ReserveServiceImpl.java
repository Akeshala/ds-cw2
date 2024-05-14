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

public class ReserveServiceImpl extends ReserveServiceGrpc.ReserveServiceImplBase implements DistributedTxListener {

    ReserveServiceGrpc.ReserveServiceBlockingStub clientStub = null;
    private ManagedChannel channel = null;
    private final ReservationServer server;
    private final DataProviderImpl dataProvider;
    private Status status = Status.FAILURE;
    private String statusMessage = "";
    private AbstractMap.SimpleEntry<String, ReserveRequest> tempDataHolder;
    public ReserveServiceImpl(ReservationServer reservationServer, DataProviderImpl dataProvider) {
        this.server = reservationServer;
        this.dataProvider = dataProvider;
    }

    @Override
    public void onGlobalCommit() {

        createReservation();
    }

    @Override
    public void onGlobalAbort() {
        tempDataHolder = null;
        status = Status.FAILURE;
        System.out.println("Global Abort");
    }

    @Override
    public synchronized void reserveItem(ReserveRequest request, StreamObserver<StatusResponse> responseObserver) {
        if (server.isLeader()) {
            try {
                startDistributedTx(request.getReservationId(), request);
                updateSecondaryServers(request);
                if (checkEligibility(request)){
                    ((DistributedTxCoordinator) server.getTransactionReserve()).perform();
                } else {
                    ((DistributedTxCoordinator) server.getTransactionReserve()).sendGlobalAbort();
                }
            } catch (Exception e) {
                System.out.println("Error while creating a reservation" + e.getMessage());
                e.printStackTrace();
            }
        } else {
            try {
                if (request.getIsSentByPrimary()) {
                    startDistributedTx(request.getReservationId(), request);
                    if (checkEligibility(request)) {
                        ((DistributedTxParticipant) server.getTransactionReserve()).voteCommit();
                    } else {
                        ((DistributedTxParticipant) server.getTransactionReserve()).voteAbort();
                    }
                } else {
                    StatusResponse response = callPrimary(request);
                    if (response.getStatus() == Status.SUCCESS) {
                        status = Status.SUCCESS;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
                e.printStackTrace();
            }
        }

        StatusResponse response = StatusResponse.newBuilder().setStatus(status).setMessage(statusMessage).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private boolean checkEligibility(ReserveRequest request) {

        if (!dataProvider.isUserExist(request.getBuyerName())) {
            statusMessage = "Buyer does not exist";
            status = Status.FAILURE;
            return false;
        }

        User buyer = dataProvider.getUser(request.getBuyerName());
        if (buyer.getRole() != Role.BUYER) {
            statusMessage = "User has a conflicting role";
            status = Status.FAILURE;
            return false;
        }

        if (!dataProvider.isItemExist(request.getItemId())) {
            statusMessage = "Item doesn't exist";
            status = Status.FAILURE;
            return false;
        }

        if (dataProvider.getItem(request.getItemId()).getAvailableQuantity() < request.getQuantity()) {
            statusMessage = "Not enough quantity";
            status = Status.FAILURE;
            return false;
        }

        return true;
    }

    private void createReservation() {
        if (tempDataHolder != null) {

            ReserveRequest request = tempDataHolder.getValue();
            dataProvider.updateItemQuantities(request.getItemId(), request.getQuantity());
            dataProvider.addReservation(request);

            System.out.println("Reservation for " + request.getItemId() + " created & committed");

            status = Status.SUCCESS;
            statusMessage = "Reservation Created Successfully";
            tempDataHolder = null;
        }
    }


    private StatusResponse callServer(
            ReserveRequest reserveRequest,
            boolean isSentByPrimary,
            String IPAddress,
            int port
    ) {
        System.out.println(IPAddress + ":" + port);

        channel = ManagedChannelBuilder.forAddress(IPAddress, port).usePlaintext().build();
        clientStub = ReserveServiceGrpc.newBlockingStub(channel);
        ReserveRequest request = reserveRequest.toBuilder().setIsSentByPrimary(isSentByPrimary).build();

        StatusResponse statusResponse = clientStub.reserveItem(request);
        return statusResponse;
    }

    private StatusResponse callPrimary(ReserveRequest reserveRequest) {
        String[] currentLeaderData = server.getLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServer(reserveRequest, false, IPAddress, port);
    }

    private void updateSecondaryServers(ReserveRequest reserveRequest) throws KeeperException, InterruptedException {
        List<String[]> othersData = server.getSecondaryData();
        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(reserveRequest, true, IPAddress, port);
        }
    }

    private void startDistributedTx(String reservationId, ReserveRequest reserveRequest) {
        try {
            server.getTransactionReserve().start(reservationId, String.valueOf(UUID.randomUUID()));
            tempDataHolder = new AbstractMap.SimpleEntry<>(reservationId, reserveRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
