package com.demo;

import com.demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        /**
         *  <aop:around method="fnAround" pointcut-ref="pointcut"/>
         *  注释掉环绕通知前后对比查看
         */
        userService.addUser("亚索", "男");

    }
}
