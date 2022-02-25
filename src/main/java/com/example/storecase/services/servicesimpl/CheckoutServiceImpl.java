package com.example.storecase.services.servicesimpl;


import com.example.storecase.dao.CheckoutDao;
import com.example.storecase.entity.CheckoutEntity;
import com.example.storecase.entity.ProductEntity;
import com.example.storecase.services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    CheckoutDao checkoutDao;

    @Override
    public boolean addCheckout(CheckoutEntity checkout) {
        return false;
    }

    @Override
    public boolean removeProductOfCheckout(Long idCheckout, Long idProduct) {
        return false;
    }

    @Override
    public CheckoutEntity getCheckoutById(Long idCheckout) {
        return null;
    }

    @Override
    public List<CheckoutEntity> getListCheckoutOfUser(Long idUser) {
        return null;
    }
}
