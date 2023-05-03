package com.example.backend.service;

import com.example.backend.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(int id);

    Product updateProduct(Product product, int id);

    void deleteProduct(int id);
}
