package com.demo.dao;

import com.demo.pojo.User;

public interface UserDao {
    public User findUserById(Integer id);
}
