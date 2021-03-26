package com.ua.lemon.yana;

import java.util.Arrays;
import java.util.Random;


public class Homework_3_5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        System.out.println(arr[1]);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = rand.nextInt(50) - 30;
            System.out.println(arr[i] + " ");
        }

            for (int j = 0; j < arr.length / 2; j++) {
                int reverse = arr[j];
                arr[j] = arr[arr.length - j - 1];
                arr[arr.length - j - 1] = reverse;
            }

            System.out.println("Reversed: ");
            System.out.println(Arrays.toString(arr));

        }
    }
