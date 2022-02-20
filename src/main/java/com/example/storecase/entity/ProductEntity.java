package com.example.storecase.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="product")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column
    private String nameProduct;

    @Column
    private Long price;

    @Column
    private Long idBrand;

    @Column
    private Long idCategories;
}
