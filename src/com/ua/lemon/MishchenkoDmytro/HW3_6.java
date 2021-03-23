package com.ua.lemon.MishchenkoDmytro;

import java.util.Random;

public class HW3_6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i<10;i++)
            arr[i] = rand.nextInt(80)-30;
        for(int i =0; i<10;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
        for(int i = 0;i<10;i++)
        {
            for(int j =0;j<9;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int reservValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = reservValue;
                }
            }
        }

        for(int i =0; i<10;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
        for(int i = 0;i<10;i++)
        {
            for(int j =0;j<9;j++)
            {
                if(arr[j]<arr[j+1]) {
                    int reservValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = reservValue;
                }
            }
        }

        for(int i =0; i<10;i++)
            System.out.print(arr[i]+" ");



    }
}
