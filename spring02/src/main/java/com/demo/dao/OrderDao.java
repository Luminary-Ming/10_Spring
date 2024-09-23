package com.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao {
    public void findOrder();

    public void addOrder();

    public void updateOrder();

    public void deleteOrder();
}