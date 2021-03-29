package com.ua.lemon.MishchenkoDmytro;

import java.util.Random;
import java.util.Scanner;

public class HW4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements in Array");
        int elArray = in.nextInt();
        System.out.println("Enter minelement in Array");
        int minElArray = in.nextInt();
        System.out.println("Enter maxelement in Array");
        int maxElArray = in.nextInt();
        int[]arr = FillDateInArray(elArray,minElArray,maxElArray);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr = SortByIncrease(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        arr = SortByDecrease(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    static int[] FillDateInArray (int elementsInArray, int minValueInArray, int maxValueInArray)
    {
        int[] arr = new int[elementsInArray];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(maxValueInArray)+minValueInArray;
        return arr;
    }

    static int[] SortByIncrease(int[] arr)
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int reservValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = reservValue;
                }
            }
        }
        return arr;
    }



    static int[] SortByDecrease(int[] arr)
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j+1]) {
                    int reservValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = reservValue;
                }
            }
        }
        return arr;
    }



}
