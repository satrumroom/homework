package com.ua.lemon.MishchenkoDmytro;

import java.util.Random;

public class HW3_5 {
    public static void main(String[] args) {
        int[] array = new int[9];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        array = ChangePlaceOfArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }

    static int[] ChangePlaceOfArray(int[]arr){
        if((arr.length/2)%2==0)
        {
            for (int i = 0, j = arr.length-1; i < arr.length; i++,j--) {
                if(i==arr.length/2)
                {
                    return arr;
                }
                else {
                    int value = arr[i];
                    arr[i] = arr[j];
                    arr[j] = value;
                }
            }

        }else{
            double StopPos = Math.round(arr.length/2.0);
            for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
                if(i == (int)StopPos)
                {
                    return arr;
                }
                else{
                    int value = arr[i];
                    arr[i] = arr[j];
                    arr[j] = value;
                }
            }
        }

        return arr;
    }
}
