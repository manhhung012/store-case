package com.example.storecase.dao;

import com.example.storecase.entity.CategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesDao extends JpaRepository<CategoriesEntity, Long> {
}
