package com.demo.service;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    public User finUserById(Integer id);

    public List<User> findAll();

    public Integer addUser(User user);

    public Integer deleteById(Integer id);
}
