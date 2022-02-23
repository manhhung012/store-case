package com.example.storecase.services.servicesimpl;

import com.example.storecase.dao.BrandDao;
import com.example.storecase.entity.BrandEntity;
import com.example.storecase.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandDao brandDao;

    @Override
    public List<BrandEntity> getAllBrand() {
        return brandDao.findAll();
    }

    @Override
    public boolean createBrand(BrandEntity brand) {
        Optional<BrandEntity> listIdBrand = brandDao.findById(brand.getId());
        if(listIdBrand.isPresent()){
            return false;
        } else {
            brandDao.save(brand);
            return true;
        }
    }
}
