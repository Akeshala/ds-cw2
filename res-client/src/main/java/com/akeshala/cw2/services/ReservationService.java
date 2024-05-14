package com.akeshala.cw2.services;

import com.akeshala.cw2.grpc.generated.ReserveServiceGrpc;
import com.akeshala.cw2.grpc.generated.ReserveRequest;
import com.akeshala.cw2.grpc.generated.StatusResponse;
import io.grpc.ManagedChannel;

import java.util.Scanner;
import java.util.UUID;

public class ReservationService {
    String host = null;
    int port = -1;
    private ManagedChannel channel = null;
    ReserveServiceGrpc.ReserveServiceBlockingStub clientStub = null;

    public ReservationService(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void init (ManagedChannel channel) {
        System.out.println("Initializing reservation service");
        this.channel = channel;
        clientStub = ReserveServiceGrpc.newBlockingStub(this.channel);
    }

    public void handleRequest(Scanner userInput) throws InterruptedException {
        System.out.println("\nEnter following details to add a reservation");
        System.out.println("Item Id, Buyer Name, Quantity, Date");

        String[] input = userInput.nextLine().trim().split(",");
        String itemId = input[0];
        String buyerName = input[1];
        int quantity = Integer.parseInt(input[2]);
        String date = input[3];

        System.out.println("Requesting server to create a reservation on " + itemId + " by " + buyerName);

        ReserveRequest request = ReserveRequest
                .newBuilder()
                .setItemId(itemId)
                .setReservationId(UUID.randomUUID().toString())
                .setBuyerName(buyerName)
                .setQuantity(quantity)
                .setReservationDate(date)
                .setIsSentByPrimary(false)
                .build();

        StatusResponse response = clientStub.reserveItem(request);
        System.out.printf("Create reservation " + response.getStatus() + ". " + response.getMessage() + "\n");

        Thread.sleep(1000);
    }

    public void close() {

        channel.shutdown();
    }
}
