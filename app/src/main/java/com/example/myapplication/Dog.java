package com.example.myapplication;

public class Dog {
    private String name;
    private String des;
    private String price;

    public Dog(String name, String pathid, String price) {
        this.name = name;
        this.des = pathid;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setPathid(String des) {
        this.des = des;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
