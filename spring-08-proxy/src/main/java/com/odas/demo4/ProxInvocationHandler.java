package com.odas.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 万能代理类
// 我们会用这个类，自动生成代理类！
public class ProxInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成得到代理类
    public Object getProxy() {
        /**
         * this.getClass().getClassLoader(): 代理角色，用来代理被代理的角色
         * target.getClass().getInterfaces(): 真实角色，即被代理的接口
         * this: 一个InvocationHandler，这里因为已经实现了InvocationHandler的接口了，所以就是自己，所以填this
         */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 反射
        log(method.getName());

        // 动态代理的本质，就是使用反射机制实现
        // 用invoke执行实例的方法，下面的这行代码表示执行rent实例里的args方法
        Object result = method.invoke(target, args);

        return result;
    }

    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }

}
