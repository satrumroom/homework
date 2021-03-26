package com.ua.lemon.MishchenkoDmytro;

import java.util.Scanner;

public class HW4_3 {
    public static void main(String[] args) {
        int firstValue, secondValue;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value that you want to increase");
        firstValue = in.nextInt();
        System.out.println("Enter to what element you want to increase your value");
        secondValue = in.nextInt();
        TableOfIncrease(firstValue,secondValue);

    }
    static void TableOfIncrease(int value, int lastElement){
        for (int i = 1; i <=lastElement ; i++) {
            System.out.println(value+"*"+i+"="+value*i);
        }
    }

}
