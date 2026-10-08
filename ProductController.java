package com.example.api;

import com.example.api.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}