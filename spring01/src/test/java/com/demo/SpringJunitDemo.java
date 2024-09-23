package com.demo;

import com.demo.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * 使用 spring 与 junit 整合包中的核心对象，来启动 junit
 * - @RunWith(SpringJUnit4ClassRunner.class)
 *  JUnit 5 中不再需要 @RunWith 注解
 */
// 加载 Spring 核心配置文件
@ContextConfiguration("classpath:applicationContext05.xml")
public class SpringJunitDemo {
    @Autowired
    private OrderService orderService;
    @Test
    public void testOrderService(){
        orderService.info();
    }
}
