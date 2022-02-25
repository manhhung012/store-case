package com.example.storecase.services.servicesimpl;

import com.example.storecase.dao.ProductDao;
import com.example.storecase.entity.ProductEntity;
import com.example.storecase.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;

    @Override
    public boolean insertProduct(ProductEntity product) {
        Optional<ProductEntity> listIdProduct = productDao.findById(product.getId());
        if(listIdProduct.isPresent()){
            return false;
        } else {
            productDao.save(product);
            return true;
        }
    }

    @Override
    public List<ProductEntity> getAllProduct() {
        return productDao.findAll();
    }

    @Override
    public List<ProductEntity> getProductByCategory(Long idCategory) {
        return productDao.findByCategories(idCategory);
    }

    @Override
    public Optional<ProductEntity> getProductById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public boolean editProduct(ProductEntity product, Long idProduct) {
        productDao.findById(idProduct).map(productEdit -> {
            productEdit.setNameProduct(product.getNameProduct());
            productEdit.setPrice(product.getPrice());
            productEdit.setImg(product.getImg());
            productEdit.setBrand(product.getBrand());
            productEdit.setCategories(product.getCategories());

            return productDao.save(productEdit);
        }).orElseGet(()->{
            product.setId(idProduct);
            return productDao.save(product);
        });
        return true;
    }
}
