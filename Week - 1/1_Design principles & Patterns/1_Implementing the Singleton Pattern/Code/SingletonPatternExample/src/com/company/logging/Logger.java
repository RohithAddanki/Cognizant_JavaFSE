package com.company.logging;

public class Logger {

    // Step 1: Private static instance (volatile for thread safety in multithreaded apps)
    private static volatile Logger instance;

    // Step 2: Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Step 3: Public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) { // Thread-safe block
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Utility method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}