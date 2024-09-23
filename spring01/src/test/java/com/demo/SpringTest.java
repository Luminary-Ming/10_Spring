package com.demo;

import com.demo.pojo.User;
import com.demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService =(UserService)context.getBean("userService");
        User user = userService.findUserById(1);
        System.out.println(user);
    }
}
