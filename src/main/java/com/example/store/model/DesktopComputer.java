package com.example.store.model;

import com.example.store.enums.FormFactor;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DesktopComputer extends Product {

    @Enumerated(EnumType.STRING)
    private FormFactor formFactor;

}
