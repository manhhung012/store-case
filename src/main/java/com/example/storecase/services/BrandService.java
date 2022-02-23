package com.example.storecase.services;

import com.example.storecase.entity.BrandEntity;

import java.util.List;

public interface BrandService {
    List<BrandEntity> getAllBrand();

    boolean createBrand(BrandEntity brand);
}
