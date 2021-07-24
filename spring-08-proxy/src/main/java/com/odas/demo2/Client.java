package com.odas.demo2;

public class Client {
    public static void main(String[] args) {
        UserService userServiceImpl = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userServiceImpl);
        proxy.add();
    }


}
