package com.example.store.service;

import com.example.store.dto.request.ProductRequest;
import com.example.store.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse save(ProductRequest product);

    ProductResponse update(Long id, ProductRequest product);

    ProductResponse getById(Long id);

    List<ProductResponse> getAll();

    void delete(Long id);
}
