package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class ListDog {
    public static List<Dog> list = new ArrayList<>();

    static {
        list.add(new Dog("Bắc Kinh ","Đẹpp","100"));
        list.add(new Dog("Phú Quốc","Đẹpp","100"));
        list.add(new Dog("Chiahuahua","Đẹpp","99"));
        list.add(new Dog("Xúc Xích","Đẹpp","99"));
        list.add(new Dog("Poodle","Đẹpp","100"));
    }

}
