package com.ua.lemon.yana;

import java.util.Random;

public class Homework_3_4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        System.out.println(arr[1]);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = rand.nextInt(50) - 30;
            System.out.println(arr[i] + " ");
        }
    }
}

