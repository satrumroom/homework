package com.ua.lemon.podplietnii.third.homework;

import java.util.Random;

public class Practice3_5 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        System.out.println("Primordial array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(80) - 30;
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < array.length / 2; i++) {
            int intermediateValue = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = intermediateValue;
        }

        System.out.println("Inverted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
