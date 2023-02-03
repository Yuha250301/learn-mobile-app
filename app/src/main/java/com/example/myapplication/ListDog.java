package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class ListDog {
    public static List<Dog> list = new ArrayList<>();

    static {
        list.add(new Dog("Bắc Kinh ",R.drawable.backinh,"100"));
        list.add(new Dog("Phú Quốc",R.drawable.phuquoc,"100"));
        list.add(new Dog("Chiahuahua",R.drawable.chihuahua,"99"));
        list.add(new Dog("Xúc Xích",R.drawable.xucxich,"99"));
        list.add(new Dog("Poodle",R.drawable.poodle,"100"));
    }

}
