package com.example.storecase.services.servicesimpl;

import com.example.storecase.dao.CategoriesDao;
import com.example.storecase.entity.CategoriesEntity;
import com.example.storecase.entity.ProductEntity;
import com.example.storecase.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesServiceImpl implements CategoriesService {
    @Autowired
    CategoriesDao categoriesDao;
    @Override
    public List<CategoriesEntity> getAllCategory() {
        return categoriesDao.findAll();
    }

    @Override
    public boolean createCategory(CategoriesEntity category) {
        Optional<CategoriesEntity> listIdCategory= categoriesDao.findById(category.getId());
        if(listIdCategory.isPresent()){
            return false;
        } else {
            categoriesDao.save(category);
            return true;
        }
    }
}
