package com.odas.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 我们会用这个类，自动生成代理类！
public class ProxInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成得到代理类
    public Object getProxy() {
        /**
         * this.getClass().getClassLoader(): 代理角色，用来代理被代理的角色
         * rent.getClass().getInterfaces(): 真实角色，即被代理的接口
         * this: 一个InvocationHandler，这里因为已经实现了InvocationHandler的接口了，所以就是自己，所以填this
         * 下面一行代码其实只要更改rent.getClass()里的rent就可以了
         */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 当用户调用代理实例去调用函数的时候，seeHouse()和fee()函数也会被执行
        // 由此可见，通过代理实例调用函数实际就是按顺序执行invoke函数里的代码
        // 但是创建代理对象以及通过代理对象调用方法的时候并不会显示地调用invoke函数
        seeHouse();

        // 动态代理的本质，就是使用反射机制实现
        // 用invoke执行实例的方法，下面的这行代码表示执行rent实例里的args方法
        Object result = method.invoke(rent, args);

        fee();

        return result;
    }

    public void seeHouse() {
        System.out.println("中介带看房子");
    }

    public void fee() {
        System.out.println("中介收中介费用");
    }
}
