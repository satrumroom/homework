package com.ua.lemon.MishchenkoDmytro;

import java.util.Random;

public class Array {
    public static void main(String[] args) {

        int []arr = new int[10];
        Random random = new Random();

        for (int i = 0; /*i<arr.length*/ i<arr.length; i++)
        {
            arr[i] = random.nextInt(20);
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int value = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = value;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }

}
