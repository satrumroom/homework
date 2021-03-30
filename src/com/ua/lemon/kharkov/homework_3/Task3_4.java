package com.ua.lemon.kharkov.homework_3;

import java.util.*;

public class Task3_4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(80) - 30;
        }
        System.out.println(Arrays.toString(arr));
    }
}
