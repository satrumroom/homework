package com.lemon.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<Integer> createSet2() {

       List<Integer> integerHashSet2 = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            double random = Math.random() * (20 + 1) - 10;
            integerHashSet2.add((int) random);
        }
        return integerHashSet2;
    }

    public static void main(String[] args) {
        System.out.println(createSet2());
    }
}
