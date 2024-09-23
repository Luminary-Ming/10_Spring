package com.demo.factory;

import com.demo.pojo.User;

/**
 * 静态工厂
 */
public class StaticFactory {
    public static User getUser(){
        return new User();
    }
}
