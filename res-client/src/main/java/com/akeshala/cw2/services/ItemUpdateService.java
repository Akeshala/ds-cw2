package com.akeshala.cw2.services;

import com.akeshala.cw2.grpc.generated.ItemUpdateServiceGrpc;
import com.akeshala.cw2.grpc.generated.ItemUpdateRequest;
import com.akeshala.cw2.grpc.generated.StatusResponse;
import io.grpc.ManagedChannel;

import java.util.Scanner;

public class ItemUpdateService {
    String host = null;
    int port = -1;
    private ManagedChannel channel = null;
    ItemUpdateServiceGrpc.ItemUpdateServiceBlockingStub clientStub = null;

    public ItemUpdateService (String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void init (ManagedChannel channel) {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        this.channel = channel;
        clientStub = ItemUpdateServiceGrpc.newBlockingStub(this.channel);
    }

    public void handleRequest(Scanner userInput) throws InterruptedException {
        System.out.println("\nEnter following details to update item");
        System.out.println("Item Id, Seller Name, Price, Available Quantity");
        String[] input = userInput.nextLine().trim().split(",");

        String itemId = input[0];
        String sellerName = input[1];
        String price = input[2];
        String availableQuantity = input[3];

        System.out.println("Requesting server to update item " + itemId);

        ItemUpdateRequest request = ItemUpdateRequest
                .newBuilder()
                .setItemId(itemId)
                .setSellerName(sellerName)
                .setPrice(Double.parseDouble(price))
                .setAvailableQuantity(Integer.parseInt(availableQuantity))
                .setIsSentByPrimary(false)
                .build();

        StatusResponse response = clientStub.updateItem(request);
        System.out.printf("Update Item " + response.getStatus() + ". " + response.getMessage() + "\n");

        Thread.sleep(1000);
    }

    public void close() {
        channel.shutdown();
    }
}