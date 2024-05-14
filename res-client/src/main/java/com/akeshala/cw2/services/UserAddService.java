package com.akeshala.cw2.services;

import com.akeshala.cw2.grpc.generated.Role;
import com.akeshala.cw2.grpc.generated.StatusResponse;
import com.akeshala.cw2.grpc.generated.UserAddRequest;
import com.akeshala.cw2.grpc.generated.UserAddServiceGrpc;
import io.grpc.ManagedChannel;

import java.util.Scanner;

public class UserAddService {

    String host = null;
    int port = -1;
    private ManagedChannel channel = null;
    UserAddServiceGrpc.UserAddServiceBlockingStub clientStub = null;

    public UserAddService(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void init (ManagedChannel channel) {
        System.out.println("Initializing Connecting to server at " + host + ":" + port);
        this.channel = channel;
        clientStub = UserAddServiceGrpc.newBlockingStub(this.channel);
    }

    private Role getRole(String role) {
        if (role.equalsIgnoreCase("SELLER")) {
            return Role.SELLER;
        } else if (role.equalsIgnoreCase("BUYER")) {
            return Role.BUYER;
        } else if (role.equalsIgnoreCase("INVENTORY_CLERK")) {
            return Role.INVENTORY_CLERK;
        } else {
            return Role.ADMIN;
        }
    }

    public void handleRequest(Scanner userInput) throws InterruptedException {
        System.out.println("\nEnter following details to add a user");
        System.out.println("Username, First Name, Last Name, Email, Address, Role");
        String[] input = userInput.nextLine().trim().split(",");

        String userName = input[0];
        String firstName = input[1];
        String lastName = input[2];
        String email = input[3];
        String address = input[4];
        String role = input[5];

        System.out.println("Requesting server to add user " + userName);

        UserAddRequest request = UserAddRequest
                .newBuilder()
                .setUserName(userName)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setAddress(address)
                .setRole(getRole(role))
                .setIsSentByPrimary(false)
                .build();

        StatusResponse response = clientStub.addUser(request);
        System.out.printf("Process Add User " + response.getStatus() + ". " + response.getMessage() + "\n");

        Thread.sleep(1000);
    }

    public void close() {

        channel.shutdown();
    }
}
