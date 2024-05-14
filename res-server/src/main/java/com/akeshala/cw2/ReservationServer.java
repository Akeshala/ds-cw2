package com.akeshala.cw2;

import com.akeshala.cw2.services.*;
import com.akeshala.cw2.sync.DistributedLock;
import com.akeshala.cw2.sync.DistributedTx;
import com.akeshala.cw2.sync.DistributedTxCoordinator;
import com.akeshala.cw2.sync.DistributedTxParticipant;
import com.akeshala.cw2.utils.DataProviderImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;

public class ReservationServer {

    private final int serverPort;
    public final DistributedLock leaderLock;
    private final AtomicBoolean isLeader = new AtomicBoolean(false);
    private byte[] leaderData;
    private DistributedTx transactionItemAdd;
    private DistributedTx transactionItemUpdate;
    private DistributedTx transactionItemDelete;
    private DistributedTx transactionReserve;
    private DistributedTx transactionUserAdd;
    private final ItemAddServiceImpl itemAddService;
    private final ItemUpdateServiceImpl itemUpdateService;
    private final ItemDeleteServiceImpl itemDeleteService;
    private final ItemSearchServiceImpl itemSearchService;
    private final ReserveServiceImpl reserveService;
    private final ReservationGetServiceImpl reservationGetService;
    private final UserAddServiceImpl userAddService;

    public ReservationServer(String host, int port) throws IOException, InterruptedException, KeeperException {

        this.serverPort = port;
        leaderLock = new DistributedLock("ReservationServerCluster", buildServerData(host, port));

        DataProviderImpl dataProvider = new DataProviderImpl();
        itemAddService = new ItemAddServiceImpl(this, dataProvider);
        itemUpdateService = new ItemUpdateServiceImpl(this, dataProvider);
        itemDeleteService = new ItemDeleteServiceImpl(this, dataProvider);
        itemSearchService = new ItemSearchServiceImpl(dataProvider);
        reserveService = new ReserveServiceImpl(this, dataProvider);
        reservationGetService = new ReservationGetServiceImpl(dataProvider);
        userAddService = new UserAddServiceImpl(this, dataProvider);

        transactionItemAdd = new DistributedTxParticipant(itemAddService);
        transactionItemUpdate = new DistributedTxParticipant(itemUpdateService);
        transactionItemDelete = new DistributedTxParticipant(itemDeleteService);
        transactionReserve = new DistributedTxParticipant(reserveService);
        transactionUserAdd = new DistributedTxParticipant(userAddService);
    }

    public static void main (String[] args) throws Exception{
        if (args.length != 1) {
            System.out.println("<port> not found");
        }

        DistributedLock.setZooKeeperURL("localhost:2181");
        DistributedTx.setZooKeeperURL("localhost:2181");

        String serverPort = args[0];
        ReservationServer server = new ReservationServer("localhost", Integer.parseInt(serverPort));
        server.start();
    }

    public void start() throws IOException, InterruptedException, KeeperException {
        System.out.println("Starting reservation server");

        Server server = ServerBuilder
                .forPort(serverPort)
                .addService(itemAddService)
                .addService(itemUpdateService)
                .addService(itemDeleteService)
                .addService(itemSearchService)
                .addService(reserveService)
                .addService(reservationGetService)
                .addService(userAddService)
                .build();
        server.start();

        System.out.println("ReservationServer Started on " + serverPort);

        // attempting to be the leader
        LeaderCampaignThread leaderCampaignThread = new LeaderCampaignThread(this);
        Thread thread = new Thread(leaderCampaignThread);
        thread.start();

        server.awaitTermination();
    }

    public void beLeader() {
        System.out.println("Become the leader.");

        isLeader.set(true);
        transactionItemAdd = new DistributedTxCoordinator(itemAddService);
        transactionItemUpdate = new DistributedTxCoordinator(itemUpdateService);
        transactionItemDelete = new DistributedTxCoordinator(itemDeleteService);
        transactionReserve = new DistributedTxCoordinator(reserveService);
        transactionUserAdd = new DistributedTxCoordinator(userAddService);
    }

    public static String buildServerData(String IP, int port) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IP).append(":").append(port);
        return stringBuilder.toString();
    }

    public synchronized String[] getLeaderData() {
        return new String(leaderData).split(":");
    }

    public List<String[]> getSecondaryData() throws KeeperException, InterruptedException {
        List<String[]> result = new ArrayList<>();
        List<byte[]> othersData = leaderLock.getOthersData();
        for (byte[] data : othersData) {
            String[] dataStrings = new String(data).split(":");
            result.add(dataStrings);
        }
        return result;
    }

    public DistributedTx getTransactionItemAdd() {

        return transactionItemAdd;
    }

    public DistributedTx getTransactionItemUpdate() {

        return transactionItemUpdate;
    }

    public DistributedTx getTransactionItemDelete() {

        return transactionItemDelete;
    }

    public DistributedTx getTransactionReserve() {

        return transactionReserve;
    }

    public DistributedTx getTransactionUserAdd() {

        return transactionUserAdd;
    }

    public boolean isLeader() {

        return isLeader.get();
    }

    public synchronized void setCurrentLeaderData(byte[] leaderData) {

        this.leaderData = leaderData;
    }
}
