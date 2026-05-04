package com.example.store.service;

import com.example.store.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    Product update(Long id, Product product);

    Product getById(Long id);

    List<Product> getAll();

    void delete(Long id);
}
