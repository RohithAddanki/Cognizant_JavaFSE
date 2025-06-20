package com.ecommerce.search;

//This is Context for strategy

import com.ecommerce.model.Product;

public class SearchContext {
    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeSearch(Product[] products, String keyword) {
        if (strategy == null) {
            throw new IllegalStateException("Search strategy not set.");
        }
        return strategy.search(products, keyword);
    }
}