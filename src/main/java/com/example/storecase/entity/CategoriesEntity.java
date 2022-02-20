package com.example.storecase.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="categories")
public class CategoriesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategories;

    @Column
    private String name;
}
