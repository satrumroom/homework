package com.ua.lemon.kharkov.homework_6;

import java.util.*;

public class Task_1_and_2 {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            numberList.add(random.nextInt(20));
        }

        System.out.println(numberList);

        Set<Integer> uniqueNumberSet = new HashSet<>(numberList);
        System.out.println(uniqueNumberSet);
    }
}
