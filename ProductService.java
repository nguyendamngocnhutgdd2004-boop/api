package com.example.api;

import com.example.api.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Laptop Dell", 1500.0));
        products.add(new Product(2L, "iPhone 15", 1200.0));
        return products;
    }
}