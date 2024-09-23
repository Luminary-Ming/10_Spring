package com.demo.service;

import com.demo.dao.UserDao;

public interface UserService {
    public void findUser();

    public Integer addUser(String name,String sex);

    public void updateUser();

    public void deleteUser();
}
