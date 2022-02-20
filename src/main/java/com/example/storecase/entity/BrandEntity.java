package com.example.storecase.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="brand")
public class BrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBrand;

    @Column
    private String name;
}
