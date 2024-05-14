package com.akeshala.cw2;

public class LeaderCampaignThread implements Runnable {
    private ReservationServer reservationServer;
    private byte[] currentLeaderData = null;

    public LeaderCampaignThread(ReservationServer reservationServer) {
        this.reservationServer = reservationServer;
    }

    @Override
    public void run() {
        System.out.println("Starting the leader Campaign");
        try {
            boolean leader = reservationServer.leaderLock.tryAcquireLock();
            while (!leader) {
                byte[] leaderData = reservationServer.leaderLock.getLockHolderData();
                if (currentLeaderData != leaderData) {
                    currentLeaderData = leaderData;
                    reservationServer.setCurrentLeaderData(currentLeaderData);
                }
                Thread.sleep(10000);
                leader = reservationServer.leaderLock.tryAcquireLock();
            }
            reservationServer.beLeader();
            currentLeaderData = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
