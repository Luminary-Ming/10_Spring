package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest04 {
    @Test
    public void testSpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext04.xml");
        Object user1 = context.getBean("user");
        Object user2 = context.getBean("user");
        Object user3 = context.getBean("user");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
