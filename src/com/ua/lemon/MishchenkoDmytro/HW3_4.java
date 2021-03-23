package com.ua.lemon.MishchenkoDmytro;

import java.util.Random;

public class HW3_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i<10;i++)
            arr[i] = rand.nextInt(80)-30;
        for(int i =0; i<10;i++)
            System.out.print(arr[i]+" ");
    }
}
