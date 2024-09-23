package com.demo.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 注解方式，增强类中的方法
 */
@Component
// 切面注解
@Aspect
public class OrderServiceImplAdvice {

    @Before("execution(* com.demo.service.OrderService.*())")
    public void fnBefore() {
        System.out.println("fn()方法 前置通知代码");
    }

    @AfterReturning("execution(* com.demo.service.OrderService.*())")
    public void fnAfterReturning() {
        System.out.println("fn()方法 返回通知代码");
    }

    @AfterThrowing("execution(* com.demo.service.OrderService.*())")
    public void fnAfterThrowing() {
        System.out.println("fn()方法 异常通知代码");
    }

    @Around("execution(* com.demo.service.OrderService.*())")
    public void fnAround() {
        System.out.println("fn()方法 环绕通知的代码");
    }

    @After("execution(* com.demo.service.OrderService.*())")
    public void fnAfter() {
        System.out.println("fn()方法 后置通知的代码");
    }
}
