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

public class UserAddServiceImpl extends UserAddServiceGrpc.UserAddServiceImplBase implements DistributedTxListener {

    UserAddServiceGrpc.UserAddServiceBlockingStub clientStub = null;
    private ManagedChannel channel = null;
    private final ReservationServer server;
    private final DataProviderImpl dataProvider;
    private boolean status = false;
    private String statusMessage = "";
    private AbstractMap.SimpleEntry<String, UserAddRequest> tempDataHolder;
    public UserAddServiceImpl(ReservationServer reservationServer, DataProviderImpl dataProvider) {
        this.server = reservationServer;
        this.dataProvider = dataProvider;
    }

    @Override
    public void onGlobalCommit() {

        persistUser();
    }

    @Override
    public void onGlobalAbort() {
        tempDataHolder = null;
        status = false;
        System.out.println("Global Abort");
    }

    @Override
    public synchronized void addUser(UserAddRequest request, StreamObserver<UserAddResponse> responseObserver) {
        if (server.isLeader()) {
            try {
                startDistributedTx(request.getUserName(), request);
                updateSecondaryServers(request);
                if (checkEligibility(request)){
                    ((DistributedTxCoordinator) server.getTransactionUserAdd()).perform();
                } else {
                    ((DistributedTxCoordinator) server.getTransactionUserAdd()).sendGlobalAbort();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            try {
                if (request.getIsSentByPrimary()) {
                    startDistributedTx(request.getUserName(), request);
                    if (checkEligibility(request)) {
                        ((DistributedTxParticipant) server.getTransactionUserAdd()).voteCommit();
                    } else {
                        ((DistributedTxParticipant) server.getTransactionUserAdd()).voteAbort();
                    }
                } else {
                    UserAddResponse response = callPrimary(request);
                    if (response.getStatus()) {
                        status = true;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }

        UserAddResponse response = UserAddResponse.newBuilder().setStatus(status).setMessage(statusMessage).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    private UserAddResponse callServer(
            UserAddRequest userAddRequest,
            boolean isSentByPrimary,
            String IPAddress,
            int port
    ) {
        System.out.println(IPAddress + ":" + port);

        channel = ManagedChannelBuilder.forAddress(IPAddress, port).usePlaintext().build();
        clientStub = UserAddServiceGrpc.newBlockingStub(channel);

        UserAddRequest request = userAddRequest.toBuilder().setIsSentByPrimary(isSentByPrimary).build();
        UserAddResponse response = clientStub.addUser(request);

        return response;
    }

    private UserAddResponse callPrimary(UserAddRequest userAddRequest) {
        String[] leaderData = server.getLeaderData();
        String IPAddress = leaderData[0];
        String port = leaderData[1];
        return callServer(userAddRequest, false, IPAddress, Integer.parseInt(port));
    }
    private void updateSecondaryServers(UserAddRequest userAddRequest) throws KeeperException, InterruptedException {
        List<String[]> othersData = server.getSecondaryData();

        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(userAddRequest, true, IPAddress, port);
        }
    }

    private void startDistributedTx(String userName, UserAddRequest userAddRequest) {
        try {
            server.getTransactionUserAdd().start(userName, String.valueOf(UUID.randomUUID()));
            tempDataHolder = new AbstractMap.SimpleEntry<>(userName, userAddRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean checkEligibility(UserAddRequest request) {
        if (dataProvider.isUserExist(request.getUserName())) {
            statusMessage = "UserName exists";
            status = false;
            return false;
        }
        return true;
    }

    private void persistUser() {
        if (tempDataHolder != null) {
            UserAddRequest request = tempDataHolder.getValue();
            dataProvider.addUser(request);

            System.out.println("User " + request.getUserName() + " of Role " + request.getRole() + " Added & committed");

            status = true;
            statusMessage = "User Added Successfully";
            tempDataHolder = null;
        }
    }
}
