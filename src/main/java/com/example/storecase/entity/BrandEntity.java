package com.example.storecase.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "brand")
public class BrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "brand")
    private List<ProductEntity> productBrand = new ArrayList<>();
}
