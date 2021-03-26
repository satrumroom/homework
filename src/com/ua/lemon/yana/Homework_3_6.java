package com.ua.lemon.yana;

import java.util.Random;
import java.util.Arrays;

public class Homework_3_6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        System.out.println(arr[1]);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = rand.nextInt(50) - 30;
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println("Max-min:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Min-max:");
        for (int j = 0; j < arr.length / 2; j++) {
            int reverse = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = reverse;
        }

        System.out.println(" ");
        System.out.println(Arrays.toString(arr));

    }
}