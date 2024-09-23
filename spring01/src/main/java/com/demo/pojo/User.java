package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户
 */
@Data
// 无参构造
//@NoArgsConstructor
// 有参构造
@AllArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private String sex;

    // 无参构造，创建 User 对象是被调用
    public User(){
        System.out.println("User 对象被创建");
    }

    // 表示 User 对象初始化
    public void init(){
        System.out.println("User 对象初始化");
    }

    // 表示 User 对象被销毁
    public void destroy(){
        System.out.println("User 对象被销毁");
    }
}
