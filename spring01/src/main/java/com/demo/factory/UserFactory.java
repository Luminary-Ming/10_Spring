package com.demo.factory;

import com.demo.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * 自定义工厂：实现 Spring 提供的 Factory 接口
 */
public class UserFactory implements FactoryBean<User> {
    /**
     * 实现接口中的 getObject() 方法，返回一个 User 对象
     */
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

}
