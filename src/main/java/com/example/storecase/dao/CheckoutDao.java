package com.example.storecase.dao;

import com.example.storecase.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutDao extends JpaRepository<CheckoutEntity, Long> {
}
