package com.example.storecase.dao;

import com.example.storecase.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandDao extends JpaRepository<BrandEntity,Long> {
}
