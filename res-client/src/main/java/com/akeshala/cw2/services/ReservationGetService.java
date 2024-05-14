package com.akeshala.cw2.services;

import com.akeshala.cw2.grpc.generated.ReservationGetServiceGrpc;
import com.akeshala.cw2.grpc.generated.UserRequest;
import com.akeshala.cw2.grpc.generated.ReservationSearchResponse;
import com.akeshala.cw2.grpc.generated.Reservation;
import io.grpc.ManagedChannel;

import java.util.Scanner;

public class ReservationGetService {
    String host = null;
    int port = -1;

    private ManagedChannel channel = null;
    ReservationGetServiceGrpc.ReservationGetServiceBlockingStub clientStub = null;
    public ReservationGetService(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void init(ManagedChannel channel) {
        System.out.println("Initializing reservation get service");
        this.channel = channel;
        clientStub = ReservationGetServiceGrpc.newBlockingStub(this.channel);
    }

    public void handleRequest(Scanner userInput) throws InterruptedException {
        System.out.println("\nEnter your username :");
        String userName = userInput.nextLine().trim();

        System.out.println("Requesting server to get items by " + userName);
        UserRequest request = UserRequest.newBuilder().setUserName(userName).build();
        ReservationSearchResponse response = clientStub.getReservations(request);

        System.out.printf("%n+-------------------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        System.out.printf(
                "%n| %-50s| %-50s| %-12s| %-16s| %-12s|%-15s|%-15s|%-16s|%n",
                "Reservation Id", "Item Id", "Item Name", "Buyer Name", "Quantity", "Reservation Date", "Payment Amount", "Seller Name"
        );
        System.out.printf("%n+-------------------------------------------------------------------------------------------------------------------------------------------------------------+%n");

        for (Reservation reservation : response.getReservationsList()) {
            System.out.printf(
                    "%n| %-50s| %-50s| %-12s| %-16s| %-12s|%-15s|%-15s|%-16s|%n",
                    reservation.getReservationId(),
                    reservation.getItemId(), reservation.getItemName(), reservation.getBuyerName(), reservation.getQuantity(),
                    reservation.getReservationDate(), reservation.getPaymentAmount(), reservation.getSellerName()
            );
            System.out.printf("%n+-------------------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        }
        Thread.sleep(1000);
    }

    public void close() {

        channel.shutdown();
    }
}
