package com.demo.aop;

/**
 * 切面，增强 UserServiceImpl 类中的方法
 */
public class UserServiceImplAdvice {
    public void fnBefore() {
        System.out.println("fn()方法 前置通知代码");
    }

    public void fnAfterReturning() {
        System.out.println("fn()方法 返回通知代码");
    }

    public void fnAfterThrowing() {
        System.out.println("fn()方法 异常通知代码");
    }

    public void fnAround() {
        System.out.println("fn()方法 环绕通知的代码");
    }

    public void fnAfter() {
        System.out.println("fn()方法 后置通知的代码");
    }
}
