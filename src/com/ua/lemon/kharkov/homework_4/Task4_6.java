package com.ua.lemon.kharkov.homework_4;

import java.util.*;

public class Task4_6 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        randomFillingList(arr);
        System.out.println(Arrays.toString(arr));

        sortingArrayMaxToMin(arr);
        System.out.println(Arrays.toString(arr));

        sortingArrayMinToMax(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void randomFillingList(int[] array){
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(80) - 30;
        }
    }

    static void sortingArrayMaxToMin(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int clone = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = clone;
                }
            }
        }
    }

    static void sortingArrayMinToMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int clone = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = clone;
                }
            }
        }
    }
}
