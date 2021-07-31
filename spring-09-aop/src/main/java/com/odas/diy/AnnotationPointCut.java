package com.odas.diy;

// 方式三: 使用注解方式实现aop

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // 标注这个类是一个切面
// 可以@Component直接注册到spring 不过这里为了更加清晰我们还是在xml里配置
public class AnnotationPointCut {

    @Before("execution(* com.odas.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=============== 方法执行前 ===============");
    }

    @After("execution(* com.odas.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=============== 方法执行后 ===============");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.odas.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        // 可以看看around的执行顺序在哪里
        System.out.println("环绕前");
        // 获得签名，所谓的签名实际上就是方法名
        Signature signature = jp.getSignature();
        System.out.println("signature(所执行的方法): " + signature);
        // 执行方法
        Object proceed = jp.proceed();

        System.out.println("环绕后");
        // 方法的返回值
        System.out.println(proceed);


    }

}
