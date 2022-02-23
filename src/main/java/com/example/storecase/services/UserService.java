package com.example.storecase.services;

import com.example.storecase.entity.UserEntity;

import java.util.List;

public interface UserService {
    boolean createUser(UserEntity user);

    boolean login(String username, String password);

    List<UserEntity> getAllUser();

    UserEntity getUserById(Long id);
}
