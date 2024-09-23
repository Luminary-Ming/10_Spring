package com.demo.dao.impl;

import com.demo.dao.UserDao;


public class UserDaoImpl implements UserDao {
    @Override
    public void findUser(){
        System.out.println("UserDaoImpl findUser");
    }

    @Override
    public Integer addUser(String name,String sex){
        System.out.println("UserDaoImpl addUser");
        return 1;
    }

    @Override
    public void updateUser(){
        System.out.println("UserDaoImpl updateUser");
    }

    @Override
    public void deleteUser(){
        System.out.println("UserDaoImpl deleteUser");
    }

}
