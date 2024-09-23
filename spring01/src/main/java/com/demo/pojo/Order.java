package com.demo.pojo;

import lombok.Data;

import java.util.Date;
/**
 * 订单
 */
@Data
public class Order {
    private Integer id;
    private Double price;
    // 订单购买时间
    private Date orderTime;
}
