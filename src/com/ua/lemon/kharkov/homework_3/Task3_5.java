package com.ua.lemon.kharkov.homework_3;

import java.util.*;

public class Task3_5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(80) - 30;
        }
        System.out.println(Arrays.toString(arr));
        invertArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void invertArray(int[] array){
        for (int i = 0; i < array.length / 2; i++){
            int cloneArray = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = cloneArray;
        }
    }
}
