package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest03 {
    public static void main(String[] args) {
        // 需要得到Spring的核心对象
        BeanFactory context = new ClassPathXmlApplicationContext("spring3.xml");
        Object user = context.getBean("user");
        System.out.println(user);

        Object user2 = context.getBean("user2");
        System.out.println(user2);

        Object user3 = context.getBean("user3");
        System.out.println(user3);
    }
}
