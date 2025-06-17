package com.pluralsight.northwindtraders.console.dao;

import com.pluralsight.northwindtraders.console.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product add(Product product);
}
