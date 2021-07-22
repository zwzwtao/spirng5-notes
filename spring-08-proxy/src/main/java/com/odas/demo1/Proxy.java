package com.odas.demo1;

public class Proxy implements Rent {

    private Landlord landlord;

    public Proxy() {

    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    public void rent() {
        seeHouse();         // 1. 房客看房
        landlord.rent();    // 2. 房客满意后房东把房子出租
        signContract();     // 3. 签合同
        fee();              // 4. 收中介费
    }

    // 中介带房客看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    // 中介签租赁合同
    public void signContract() {
        System.out.println("签租赁合同");
    }

    // 中介收中介费
    public void fee() {
        System.out.println("收中介费");
    }
}

