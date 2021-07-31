package com.odas.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {

    // 执行前打log
    // method: 要执行的目标对象的方法
    // objects(改名成args): 参数，args
    // o(改名成target): target, 目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
