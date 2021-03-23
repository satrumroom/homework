package com.ua.lemon.MishchenkoDmytro;

import java.util.Random;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
    /*    int[] arr = GenerateArray(10,20);
     *//*   for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }*//*
        PrintArray(arr);
        System.out.println(MaxValue(arr));
//        print(3,"Hello Dima");
*/

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        System.out.println(str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.substring(4));
        System.out.println(str1.substring(4,7));
        System.out.println(str1.startsWith("Hell"));

        System.out.println(str1.trim());

    }

    /*static void print(int value, String text){
        for (int i = 0; i < value; i++) {
            System.out.println(text);
        }
    }*/

    static int[] GenerateArray(int amount, int maxValue){
        int[] value = new int[0];
        if(amount > maxValue)
            return value;
        else {
            Random rand = new Random();
            value = new int[amount];
            for (int i = 0; i < amount; i++)
                value[i] = rand.nextInt(50);
            return value;
        }

    }

    static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    static int MaxValue(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }



}
