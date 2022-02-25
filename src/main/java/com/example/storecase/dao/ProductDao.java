package com.example.storecase.dao;

import com.example.storecase.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findByCategories(Long idCategories);
}
