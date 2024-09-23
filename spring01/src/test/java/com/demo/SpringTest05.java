package com.demo;

import com.demo.dao.OrderDao;
import com.demo.pojo.Order;
import com.demo.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringTest05 {
    @Autowired
    private OrderDao orderDao;
    @Test
    public void info(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext05.xml");
        OrderService orderService  = context.getBean(OrderService.class);
        System.out.println(orderService);

    }

    @Test
    public void testOrderServiceImpl(){
        System.out.println(orderDao);
    }
}
