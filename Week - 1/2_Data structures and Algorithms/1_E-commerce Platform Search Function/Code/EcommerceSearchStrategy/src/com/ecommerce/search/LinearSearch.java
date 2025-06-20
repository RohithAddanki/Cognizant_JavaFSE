package com.ecommerce.search;

//This is a Concrete Strategy class

import com.ecommerce.model.Product;

public class LinearSearch implements SearchStrategy {

    @Override
    public int search(Product[] products, String keyword) {
        for (int i = 0; i < products.length; i++) {
            String name = products[i].getProductName();
            if (name.equalsIgnoreCase(keyword)) {
                return i;
            }
        }
        return -1;
    }
}