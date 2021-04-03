package com.ua.lemon.MishchenkoDmytro.TASKFROMOleksii;

public class Second_Task {
    public static void main(String[] args) {
        ArraySecond_Task array = new ArraySecond_Task();
        int[] arr = array.getArray();
        array.printArray(arr);
        System.out.println(array.sumOfArray(arr));
        System.out.println(array.averageValue(arr));
        System.out.println(array.minElementOfArray(arr));
        System.out.println(array.productOfNumbers(arr));
    }
}
