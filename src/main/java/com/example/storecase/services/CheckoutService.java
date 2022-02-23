package com.example.storecase.services;

import com.example.storecase.entity.CheckoutEntity;

public interface CheckoutService {
    CheckoutEntity createCheckout(CheckoutEntity checkout);

    boolean addProductToCheckout(Long idCheckout, Long idProduct);

    boolean removeProductOfCheckout(Long idCheckout, Long idProduct);

    CheckoutEntity getCheckouById(Long idCheckout);
}
