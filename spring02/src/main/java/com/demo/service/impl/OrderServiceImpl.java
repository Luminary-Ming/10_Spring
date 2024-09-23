package com.demo.service.impl;

import com.demo.dao.OrderDao;
import com.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public void findOrder() {
        System.out.println("OrderServiceImpl findOrder");
    }

    @Override
    public void addOrder() {
        System.out.println("OrderServiceImpl addOrder");
    }

    @Override
    public void updateOrder() {
        System.out.println("OrderServiceImpl updateOrder");
    }

    @Override
    public void deleteOrder() {
        System.out.println("OrderServiceImpl deleteOrder");
    }
}
