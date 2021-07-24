package com.odas.demo4;

import com.odas.demo2.UserService;
import com.odas.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserService userService = new UserServiceImpl();
        // 代理角色，不存在，所以new一个
        ProxInvocationHandler pih = new ProxInvocationHandler();
        // 设置要代理的对象
        pih.setTarget(userService);
        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
