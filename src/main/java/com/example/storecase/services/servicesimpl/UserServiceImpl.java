package com.example.storecase.services.servicesimpl;

import com.example.storecase.dao.UserDao;
import com.example.storecase.entity.UserEntity;
import com.example.storecase.services.CheckoutService;
import com.example.storecase.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Autowired
    CheckoutService checkoutService;

    @Override
    public boolean createUser(UserEntity user) {
        Optional<UserEntity> listIdUser = userDao.findById(user.getId());
        if(listIdUser.isPresent()){
            return false;
        } else {
            userDao.save(user);
            return true;
        }
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public List<UserEntity> getAllUser() {
        return null;
    }

    @Override
    public UserEntity getUserById(Long id) {
        return null;
    }
}
