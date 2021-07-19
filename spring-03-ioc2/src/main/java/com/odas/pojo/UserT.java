package com.odas.pojo;

public class UserT {

    private String name;

    public UserT() {
        System.out.println("UserT is constructed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
