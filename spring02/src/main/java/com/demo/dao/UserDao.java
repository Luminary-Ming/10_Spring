package com.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public void findUser();

    public Integer addUser(String name,String sex);

    public void updateUser();

    public void deleteUser();
}
