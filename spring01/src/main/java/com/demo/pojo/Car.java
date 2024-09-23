package com.demo.pojo;

import lombok.Data;

/**
 * 小汽车
 */
@Data
public class Car {
    private Integer id;
    private String CarName;
    // 汽车类型（轿车、商务车...）
    private String CarType;
}
