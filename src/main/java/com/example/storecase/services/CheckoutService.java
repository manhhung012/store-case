package com.example.storecase.services;

import com.example.storecase.entity.CheckoutEntity;

import java.util.List;

public interface CheckoutService {
    boolean addCheckout(CheckoutEntity checkout);

    boolean removeProductOfCheckout(Long idCheckout, Long idProduct);

    CheckoutEntity getCheckoutById(Long idCheckout);

    List<CheckoutEntity> getListCheckoutOfUser(Long idUser);
}
