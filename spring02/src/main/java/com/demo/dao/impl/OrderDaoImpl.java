package com.demo.dao.impl;

import com.demo.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void findOrder(){
        System.out.println("findOrder");
    }

    @Override
    public void addOrder(){
        System.out.println("addOrder");
    }

    @Override
    public void updateOrder(){
        System.out.println("updateOrder");
    }

    @Override
    public void deleteOrder(){
        System.out.println("deleteOrder");
    }

}
