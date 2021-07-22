package com.odas.demo1;

public class Tenant {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        // 代理，中介帮房东租房子，但是呢？代理角色一般会有一些附属操作
        // 如下所示，中介代理的是某个特定的房东，所以new一个特定的landlord对象
        Proxy proxy = new Proxy(landlord);
        // 你不用面对房东，直接找中介租房即可
        proxy.rent();
    }
}
