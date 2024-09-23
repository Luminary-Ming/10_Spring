package com.demo;

import com.demo.service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// @ExtendWith(SpringExtension.class)
// @ContextConfiguration("classpath:spring02.xml")
@SpringJUnitConfig(locations = "classpath:spring02.xml")
public class SpringTest02 {
    @Autowired
    private OrderService orderService;
    @Test
    public void test(){
        orderService.addOrder();
        System.out.println(orderService);
    }
}

/**
 * 问题：spring 整合 junit 单元测试，使用 @Autowired 注入为 null
 * -
 * spring 整合 junit4
 * @RunWith(SpringJUnit4ClassRunner.class)
 * @ContextConfiguration("classpath:spring2.xml")
 * -
 * spring 整合 junit5
 * @ExtendWith(SpringExtension.class)
 * @ContextConfiguration("classpath:spring02.xml")
 * 或使用复合注解
 * @SpringJUnitConfig(locations = "classpath:spring02.xml")
 */
