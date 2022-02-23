package com.example.storecase.services;

import com.example.storecase.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    boolean insertProduct(ProductEntity product);

    List<ProductEntity> getAllProduct();

    List<ProductEntity> getProductByCategory(Long idCategory);

    Optional<ProductEntity> getProductById(Long id);

    boolean editProduct(ProductEntity product, Long idProduct);
}
