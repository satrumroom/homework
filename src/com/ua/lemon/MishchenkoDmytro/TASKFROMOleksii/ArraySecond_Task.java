package com.ua.lemon.MishchenkoDmytro.TASKFROMOleksii;

import java.util.Random;

public class ArraySecond_Task {

    public int[] getArray() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int minElementOfArray(int[] arr) {

        int minEl = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minEl > arr[i]) {
                minEl = arr[i];
            }
        }
        return minEl;
    }

    public double averageValue(int[] arr) {
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        result /= arr.length;
        return result;
    }

    public int sumOfArray(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public long productOfNumbers(int[]arr)
    {
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }


}
