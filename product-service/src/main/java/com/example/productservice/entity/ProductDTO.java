package com.example.productservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor

public class ProductDTO extends Product{
    private long categoryID;

    public ProductDTO(long id, String uid, boolean activated, String name, String mainDesc, String descHtml, float price, String[] imageUrls, String parameters, LocalDate createdAt, long categoryID) {
        super(id, uid, activated, name, mainDesc, descHtml, price, imageUrls, parameters, createdAt);
        this.categoryID = categoryID;
    }
}
