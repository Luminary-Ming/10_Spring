package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.pojo.User;
import com.demo.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    /**
     * 构造方法
     */
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }
}
