package com.ua.lemon.MishchenkoDmytro;

import java.util.Random;
import java.util.Scanner;

public class HW4_4 {

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
    }

    static int[] FillDateInArray (int elementsInArray, int minValueInArray, int maxValueInArray)
    {
        int[] arr = new int[elementsInArray];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(maxValueInArray)+minValueInArray;
        return arr;
    }
}
