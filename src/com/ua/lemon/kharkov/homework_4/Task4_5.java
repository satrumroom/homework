package com.ua.lemon.kharkov.homework_4;

import java.util.*;

public class Task4_5 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        randomFillingList(arr);

        System.out.println(Arrays.toString(arr));
        invertArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void randomFillingList(int[] array){
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(80) - 30;
        }
    }

    static void invertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int cloneArray = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = cloneArray;
        }
    }
}
