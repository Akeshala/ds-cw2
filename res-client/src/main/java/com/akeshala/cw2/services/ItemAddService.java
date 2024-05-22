package com.akeshala.cw2.services;

import com.akeshala.cw2.grpc.generated.ItemAddServiceGrpc;
import com.akeshala.cw2.grpc.generated.ItemAddRequest;
import com.akeshala.cw2.grpc.generated.AddItemResponse;
import com.akeshala.cw2.grpc.generated.Type;
import io.grpc.ManagedChannel;

import java.util.Scanner;
import java.util.UUID;

public class ItemAddService {
    private ManagedChannel channel = null;
    ItemAddServiceGrpc.ItemAddServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public ItemAddService(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void init (ManagedChannel channel) {
        System.out.println("Initializing item add service");
        this.channel = channel;
        clientStub = ItemAddServiceGrpc.newBlockingStub(this.channel);
    }

    private Type getType(String type) {
        if (type.equalsIgnoreCase("NEW_ARRIVAL")) {
            return Type.NEW_ARRIVAL;
        } else if (type.equalsIgnoreCase("SELL")) {
            return Type.SELL;
        } else {
            return Type.RENT;
        }
    }

    public void handleRequest(Scanner userInput) throws InterruptedException {
        System.out.println("\nEnter following details to add an item");
        System.out.println("Item name, Type, Price, Available quantity & Seller's name");
        String[] input = userInput.nextLine().trim().split(",");

        String itemName = input[0];
        String type = input[1];
        double price = Double.parseDouble(input[2]);
        int availableQuantity = Integer.parseInt(input[3]);
        String sellerName = input[4];

        System.out.println("Requesting server to add item " + itemName);

        ItemAddRequest request = ItemAddRequest
                .newBuilder()
                .setItemId(itemName + "_" + UUID.randomUUID())
                .setItemName(itemName)
                .setType(getType(type))
                .setPrice(price)
                .setAvailableQuantity(availableQuantity)
                .setSellerName(sellerName)
                .setIsSentByPrimary(false)
                .build();

        AddItemResponse response = clientStub.addItem(request);
        System.out.printf("Add item: " + response.getStatus() + ". " + response.getMessage() + "\n");

        Thread.sleep(1000);
    }

    public void close() {
        channel.shutdown();
    }
}
