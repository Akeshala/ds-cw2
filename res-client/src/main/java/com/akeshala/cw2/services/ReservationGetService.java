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

        String horizontalLine = "+----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+";
        String headerFormat = "| %-50s| %-50s| %-15s| %-18s| %-15s|%-18s|%-18s|%-18s|%n";
        String itemFormat = "| %-50s| %-50s| %-15s| %-18s| %-15s|%-18s|%-18s|%-18s|%n";

        System.out.printf("%n%s %n", horizontalLine);
        System.out.printf(headerFormat, "Reservation Id", "Item Id", "Item Name", "Buyer Name", "Quantity", "Reservation Date", "Payment Amount", "Seller Name");
        System.out.printf("%s %n", horizontalLine);

        for (Reservation reservation : response.getReservationsList()) {
            System.out.printf(itemFormat, reservation.getReservationId(), reservation.getItemId(), reservation.getItemName(),
                    reservation.getBuyerName(), reservation.getQuantity(), reservation.getReservationDate(), reservation.getPaymentAmount(), reservation.getSellerName());
            System.out.printf("%s %n", horizontalLine);
        }
        Thread.sleep(1000);
    }

    public void close() {

        channel.shutdown();
    }
}
