package com.akeshala.cw2.utils;

public class ConsolePrinter {

    public static void displayMenu(){
        System.out.println("Reservation Service - Client Menu");
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("1. Add Items");
        System.out.println("2. List Items by Seller");
        System.out.println("3. Show Full item list");
        System.out.println("4. Update Item");
        System.out.println("5. Delete Item");//
        System.out.println("6. Reserve Item");//
        System.out.println("7. List Reservations");
        System.out.println("8. Add User");
        System.out.println("9. Exit");

        System.out.println();
        System.out.print("Enter your choice: ");
    }

    public static void displayStart() {
        System.out.println("Reservation system client started!");
        System.out.println();
    }

    public static void displayStop() {
        System.out.println("Reservation system client stopped!");
        System.out.println();
    }
}
