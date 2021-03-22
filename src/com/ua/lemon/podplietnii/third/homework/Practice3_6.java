package com.ua.lemon.podplietnii.third.homework;

import java.util.Arrays;
import java.util.Random;

public class Practice3_6 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(80) - 30;
        }
        System.out.println("Primordial array: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int intermediateValue = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = intermediateValue;
                }
            }
        }
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int intermediateValue = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = intermediateValue;
                }
            }
        }
        System.out.println("Sorted inverted array: ");
        System.out.println(Arrays.toString(array));
    }
}
