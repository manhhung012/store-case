package com.example.storecase.dao;

import com.example.storecase.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<ProductEntity, Long> {
}
