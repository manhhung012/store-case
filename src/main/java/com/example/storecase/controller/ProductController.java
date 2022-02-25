package com.example.storecase.controller;

import com.example.storecase.entity.ProductEntity;
import com.example.storecase.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    ProductService productService;


    @GetMapping("/product")
    public List<ProductEntity> getAllProduct(){
        return productService.getAllProduct();
    }
}
