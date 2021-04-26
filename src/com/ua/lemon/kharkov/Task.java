package com.ua.lemon.kharkov;


import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) throws Exception{
        List<Integer> number = new ArrayList<>(5);
        for (int i = 0; i < 6; i++) {
            number.add(i);
        }

        try {
            System.out.println(number.get(20));
        } catch (Exception e){
            System.out.println("Not found");
        }
    }
}
