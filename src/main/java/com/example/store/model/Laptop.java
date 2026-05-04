package com.example.store.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Laptop extends Product {
    private int sizeInches;
}
