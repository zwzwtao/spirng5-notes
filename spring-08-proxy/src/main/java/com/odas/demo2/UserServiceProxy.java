package com.odas.demo2;

/**
 * 通过增加一个 UserService 代理，来自定义里性地增加一些自己想要的方法
 * 比如如下代理就实现了在调用每个原来类的方法的时候
 */
public class UserServiceProxy implements UserService{

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    // 日志方法
    public void log(String msg) {
        System.out.println("[Debug]使用了" + msg + "方法");
    }

}
