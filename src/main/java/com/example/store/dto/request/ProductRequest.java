package com.example.store.dto.request;

import lombok.Data;

@Data
public class ProductRequest {
    private String serialNumber;
    private String manufacturer;
    private double price;
    private int stockCount;
}
