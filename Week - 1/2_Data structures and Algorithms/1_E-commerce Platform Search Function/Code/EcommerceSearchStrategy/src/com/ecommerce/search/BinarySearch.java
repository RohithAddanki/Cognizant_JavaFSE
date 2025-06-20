package com.ecommerce.search;

//This is a Concrete Strategy class

import com.ecommerce.model.Product;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch implements SearchStrategy {

    @Override
    public int search(Product[] products, String keyword) {
        Arrays.sort(products, Comparator.comparing(p -> p.getProductName().toLowerCase()));

        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String productName = products[mid].getProductName();

            int cmp = productName.compareToIgnoreCase(keyword);

            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}