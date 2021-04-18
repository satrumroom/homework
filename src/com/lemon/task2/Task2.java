package com.lemon.task2;

import java.util.*;

public class Task2 {
    public static HashSet<Integer> createSet() {

        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int i = 0; i < 30; i++) {
            double random = Math.random() * (10 + 1) - 5;
            integerHashSet.add((int) random);
        }
        return integerHashSet;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
    }
}
