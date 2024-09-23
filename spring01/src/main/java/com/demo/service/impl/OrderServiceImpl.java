package com.demo.service.impl;

import com.demo.dao.OrderDao;
import com.demo.pojo.Order;
import com.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Spring 注解开发方式：
 * 前提条件：需要在 Spring 核心配置文件中开启注解或配置注解所在的扫描包
 * <context:annotation-config/>
 * <context:component-scan base-package="com.spring" />
 * -
 * 1. @Component ：将当前这个类交给 Spring 管理（称为 Spring 容器中的一个对象）
 * 等价于在 Spring 的配置文件中的 bean 标签
 * <bean id="OrderService" class="com.demo.service.impl.OrderServiceImpl"/>
 * -
 * - @Component 虽然可以把类讲给 Spring 管理。但是语义不明确（针对开发项目分层 dao、service、web等）
 * 因此衍生出了关于 @Component 注解的分层注解：
 * - @Repository：dao 层
 * - @Service：   service 层
 * - @Controller：web 层
 * 如果一个类不属于任何一层，这时就可以使用 @Component 进行标注。
 * -
 * 2. @Autowired：默认是将 Spring 管理的对象注入到类的成员变量中，如果需要根据 bean 名称注入指定对象，
 * 就需要配合 @Qualifier("abc") 注解使用，在括号中指定需要注入的 bean 的名称。
 * -
 * 3. @Value：给类的基本数据类型、包装类、String类型的属性注入数据
 * -
 * 4. @Scope：配置当前类的作用域（单例、多例、request、session级别）
 * - @Scope(value="singleton") 单例 Bean，在程序通过 Spring 获取当前的 Bean 的时候，不管获取多少次，永远得到的对象是唯一的。
 * - @Scope(value="prototype") 多例 Bean，每次通过 Spring 获取的 Bean 都不相同。
 * -
 * 5. 注解标注对象初始化时和销毁时的方法
 * - @PostConstruct 对象初始化时的方法，相当于配置文件中 bean 标签中的 init-method
 * - @PreDestroy 对象销毁的方法，相当于配置文件中 bean 标签中的 destroy-method
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    @Qualifier("abc")
    private OrderDao orderDao;
    // 导入外部文件 info.properties 中的数据
    @Value("${userName}")
    private String username;
    // 导入外部文件 info.properties 中的数据
    @Value("${age}")
    private Integer age;
    @Value("男")
    private String sex;


    @Override
    public void info() {
        System.out.println("orderDao=" + orderDao + "，username=" + username + "，age=" + age + "，sex=" + sex);
    }

    @Override
    public Order findOrderById() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new OrderServiceImpl().orderDao);
    }
}
