package com.demo.factory;

import com.demo.pojo.User;

/**
 * 工厂方式：利用的 Java 设计模式的工厂设计模式（静态工厂，实例工厂）对类的对象进行管理。
 * 1. 实例工厂方法：在类中提供的非静态的方法，这个方法中返回需要获取的Bean对象。
 * 2. 静态工厂方法：在一个类中书写静态的方法，这个方法返回某个 Bean 的对象（在方法中创建 Bean 的对象）。
 */
public class InstanceFactory {
    public User getUser(){
        return new User();
    }
}
