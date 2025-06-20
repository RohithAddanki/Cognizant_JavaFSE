package com.company.logging;

public class Main {
    public static void main(String[] args) {
        // Get two instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages
        logger1.log("Initializing the system...");
        logger2.log("System is running...");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("✅ Only one instance of Logger exists.");
        } else {
            System.out.println("❌ Different instances of Logger exist!");
        }
    }
}