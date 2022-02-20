package com.example.storecase.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_product")
    private String nameProduct;

    @Column(name = "price")
    private Long price;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Long brand;

    @ManyToOne
    @JoinColumn(name = "categories_id")
    private Long categories;
}
