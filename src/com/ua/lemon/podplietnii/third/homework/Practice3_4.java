package com.ua.lemon.podplietnii.third.homework;

import java.util.Arrays;
import java.util.Random;

public class Practice3_4 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(80) - 30;
        }

        System.out.println(Arrays.toString(array));
    }
}
