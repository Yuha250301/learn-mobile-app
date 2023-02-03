package com.example.myapplication;

public class Dog {
    private String name;
    private int pathid;
    private String price;

    public Dog(String name, int pathid, String price) {
        this.name = name;
        this.pathid = pathid;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPathid() {
        return pathid;
    }

    public void setPathid(int pathid) {
        this.pathid = pathid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
