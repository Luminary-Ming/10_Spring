package com.demo.dao.impl;

import com.demo.dao.UserDao;
import com.demo.pojo.User;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl(){}
    public UserDaoImpl(String userName,Integer age,String sex){
        System.out.println("UserDaoImpl---"+"userName="+userName+"，age="+age+"，sex="+sex);
    }
    public UserDaoImpl(User user){
        System.out.println(user);
    }

    @Override
    public User findUserById(Integer id) {
        // 查询数据库，最终根据 id 返回一个 User 对象
        User user = new User(1,"亚索","男");
        return user;
    }
}
