package com.example.storecase.services;

import com.example.storecase.entity.CategoriesEntity;

import java.util.List;

public interface CategoriesService {
    List<CategoriesEntity> getAllCategory();

    boolean createCategory(CategoriesEntity category);
}
