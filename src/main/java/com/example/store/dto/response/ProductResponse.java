package com.example.store.dto.response;

import lombok.Data;

@Data
public class ProductResponse {
    private Long id;
    private String serialNumber;
    private String manufacturer;
    private double price;
    private int stockCount;
}
