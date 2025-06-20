package com.forecast.app;

import com.forecast.core.RecursiveForecast;
import com.forecast.model.ForecastRequest;

//This is the main class , Entry point: handles user input, runs forecasting, outputs results

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecursiveForecast forecast = new RecursiveForecast();
        boolean exit = false;

        System.out.println("=== Financial Forecasting Tool ===");

        while (!exit) {
            System.out.print("Enter initial value: ");
            double initial = scanner.nextDouble();

            System.out.print("Enter annual growth rate (e.g., 0.05 for 5%): ");
            double growthRate = scanner.nextDouble();

            System.out.print("Enter number of years to forecast: ");
            int years = scanner.nextInt();
            scanner.nextLine();  // Consume leftover newline

            ForecastRequest request = new ForecastRequest(initial, growthRate, years);
            double result = forecast.runForecast(request);

            System.out.printf("Predicted Future Value after %d years: %.2f%n", years, result);

            System.out.print("\nDo you want to forecast again? (yes/no): ");
            exit = scanner.nextLine().equalsIgnoreCase("no");
        }

        scanner.close();
        System.out.println("Thank you for using the forecasting system.");
    }
}