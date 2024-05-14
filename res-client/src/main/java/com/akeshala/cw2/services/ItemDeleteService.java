package com.akeshala.cw2.services;

import com.akeshala.cw2.grpc.generated.ItemDeleteRequest;
import com.akeshala.cw2.grpc.generated.ItemDeleteServiceGrpc;
import com.akeshala.cw2.grpc.generated.StatusResponse;
import io.grpc.ManagedChannel;

import java.util.Scanner;

public class ItemDeleteService {
    String host = null;
    int port = -1;
    private ManagedChannel channel = null;
    ItemDeleteServiceGrpc.ItemDeleteServiceBlockingStub clientStub = null;

    public ItemDeleteService (String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void init (ManagedChannel channel) {
        System.out.println("Initializing item delete service");
        this.channel = channel;
        clientStub = ItemDeleteServiceGrpc.newBlockingStub(this.channel);
    }

    public void handleRequest(Scanner userInput) throws InterruptedException {
        System.out.println("\nEnter following details to delete item");
        System.out.println("Item Id, Seller Name");
        String[] input = userInput.nextLine().trim().split(",");

        String itemId = input[0];
        String sellerName = input[1];
        System.out.println("Requesting server to delete item " + itemId);

        ItemDeleteRequest request = ItemDeleteRequest
                .newBuilder()
                .setItemId(itemId)
                .setSellerName(sellerName)
                .setIsSentByPrimary(false)
                .build();

        StatusResponse response = clientStub.deleteItem(request);
        System.out.printf("Delete Item " + response.getStatus() + ". " + response.getMessage() + "\n");

        Thread.sleep(1000);
    }

    public void close() {
        channel.shutdown();
    }
}
