package com.example.storecase.dao;

import com.example.storecase.entity.CategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesDao extends JpaRepository<CategoriesEntity, Long> {
}
