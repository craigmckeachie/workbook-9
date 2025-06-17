package com.pluralsight.northwindtraders.console.dao;

import com.pluralsight.northwindtraders.console.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements  ProductDao{
    private List<Product> products = new ArrayList<>();
    private int lastProductId = 3;

    public SimpleProductDao() {
            products.add(new Product(1, "Coffee", "Beverage", 6));
            products.add(new Product(2, "Green Tea", "Beverage", 3));
            products.add(new Product(3, "Smoothie", "Beverage", 7));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product add(Product product) {
        if(product.getProductId() == 0){
            product.setProductId(lastProductId + 1);
            lastProductId++;
        }
        products.add(product);
        return product;
    }
}
