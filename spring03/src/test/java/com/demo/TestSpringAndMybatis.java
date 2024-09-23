package com.demo;

import com.demo.mapper.UserMapper;
import com.demo.pojo.User;
import com.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:spring-mybatis.xml")
public class TestSpringAndMybatis {
    @Autowired
    private UserService userService;
    @Test
    public void testFinUserById(){
        User user = userService.finUserById(1);
        System.out.println(user);
    }
    @Test
    public void testFindAll(){
        List<User> all = userService.findAll();

        all.forEach(System.out::println);
    }
}
