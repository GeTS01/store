package com.example.store.mapper;

import com.example.store.dto.request.ProductRequest;
import com.example.store.dto.response.ProductResponse;
import com.example.store.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequest request) {
        Product product = new Product();
        product.setSerialNumber(request.getSerialNumber());
        product.setManufacturer(request.getManufacturer());
        product.setPrice(request.getPrice());
        product.setStockCount(request.getStockCount());
        return product;
    }

    public ProductResponse toResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setSerialNumber(product.getSerialNumber());
        response.setManufacturer(product.getManufacturer());
        response.setPrice(product.getPrice());
        response.setStockCount(product.getStockCount());
        return response;
    }
}
