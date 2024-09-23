package com.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest02 {
    public static void main(String[] args) {
        // 需要得到Spring的核心对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");

        Object obj = context.getBean("order");
        System.out.println(obj);
    }
}
