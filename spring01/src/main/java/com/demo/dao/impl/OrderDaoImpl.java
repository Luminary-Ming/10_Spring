package com.demo.dao.impl;

import com.demo.dao.OrderDao;
import com.demo.pojo.Order;
import org.springframework.stereotype.Repository;

// 给当前类的 bean 标签命名
@Repository("abc")
public class OrderDaoImpl implements OrderDao {
    @Override
    public Order findOrderById() {
        return null;
    }
}
