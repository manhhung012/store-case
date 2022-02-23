package com.example.storecase.services.servicesimpl;


import com.example.storecase.entity.CheckoutEntity;
import com.example.storecase.services.CheckoutService;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Override
    public CheckoutEntity createCheckout(CheckoutEntity checkout) {
        return null;
    }

    @Override
    public boolean addProductToCheckout(Long idCheckout, Long idProduct) {
        return false;
    }

    @Override
    public boolean removeProductOfCheckout(Long idCheckout, Long idProduct) {
        return false;
    }

    @Override
    public CheckoutEntity getCheckouById(Long idCheckout) {
        return null;
    }
}
