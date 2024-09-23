package com.demo.service;

import com.demo.pojo.Order;

public interface OrderService {
    public Order findOrderById();
    // 打印信息
    public void info();
}
