package com.ecommerce.app;

//This is the main class

import com.ecommerce.model.Product;
import com.ecommerce.search.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Smartphone", "Electronics"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Headphones", "Electronics"),
            new Product(4, "TV", "Electronics"),
            new Product(5, "Shoes", "Fashion"),
            new Product(6, "Furniture", "Home Goods"),
            new Product(7, "Ebook", "Books"),
            new Product(8, "Games", "Toys and Hobbies"),
            new Product(9, "Skincare", "Health and Beauty"),
            new Product(10, "Snacks", "Food and Beverage"),
            new Product(11, "Tablet", "Electronics"),
            new Product(12, "Camera", "Electronics"),
            new Product(13, "Backpack", "Fashion"),
            new Product(14, "Desk Lamp", "Home Goods"),
            new Product(15, "Cookware", "Home Goods"),
            new Product(16, "Novel", "Books"),
            new Product(17, "Puzzle", "Toys and Hobbies"),
            new Product(18, "Vitamins", "Health and Beauty"),
            new Product(19, "Chocolate", "Food and Beverage"),
            new Product(20, "Smartwatch", "Electronics")
        };

        Scanner scanner = new Scanner(System.in);
        SearchContext context = new SearchContext();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== E-Commerce Product Search ===");

            System.out.println("\nChoose Search Algorithm:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.print("Enter choice (1 or 2): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1 -> context.setStrategy(new LinearSearch());
                case 2 -> context.setStrategy(new BinarySearch());
                default -> {
                    System.out.println("❌ Invalid choice. Try again.");
                    continue;
                }
            }

            System.out.print("Enter product name to search: ");
            String keyword = scanner.nextLine();

            long startTime = System.nanoTime();
            int resultIndex = context.executeSearch(products, keyword);
            long endTime = System.nanoTime();

            System.out.println("\n--- Search Result ---");
            if (resultIndex != -1) {
                System.out.println("✅ Product Found: " + products[resultIndex]);
            } else {
                System.out.println("❌ Product not found.");
            }

            System.out.println("Time taken: " + (endTime - startTime) + " ns");

            System.out.print("\nDo you want to search again? (yes/no): ");
            exit = scanner.nextLine().equalsIgnoreCase("no");
        }

        scanner.close();
        System.out.println("Thank you for using the search system.");
    }
}