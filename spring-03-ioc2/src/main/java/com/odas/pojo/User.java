package com.odas.pojo;

public class User {

    private String name;

    // 如果要在bean中引用，无参构造有参构造一定要有一个，如果皆无，无参构造会自动创建
    // 但是如果有参构造函数被定义，则必须手动定义无参构造函数
//    public User() {
//        System.out.println("User的无参构造");
//    }

    public User (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // set函数也一定要有，bean里的赋值就是通过set函数实现
    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
