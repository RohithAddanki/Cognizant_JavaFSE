package com.ecommerce.search;

//This is a Strategy Interface class

import com.ecommerce.model.Product;

public interface SearchStrategy {
    int search(Product[] products, String keyword);
}
