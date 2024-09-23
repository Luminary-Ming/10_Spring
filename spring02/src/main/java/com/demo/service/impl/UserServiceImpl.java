package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void findUser() {
        System.out.println("UserServiceImpl findUser");
        this.userDao.findUser();
    }

    @Override
    public Integer addUser(String name,String sex){
        System.out.println("UserServiceImpl addUser");
        return this.userDao.addUser(name, sex);
    }

    @Override
    public void updateUser() {
        System.out.println("UserServiceImpl updateUser");
        this.userDao.updateUser();
    }

    @Override
    public void deleteUser() {
        System.out.println("UserServiceImpl deleteUser");
        this.userDao.deleteUser();
    }
}
