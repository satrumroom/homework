package com.ua.lemon.MishchenkoDmytro;

import java.util.Scanner;

public class HW2_1 {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        number = in.nextInt();
        if((number>0)&&(number<10))
            System.out.println("Positive number from 0 to 10");
        else
            System.out.println("Positive number bigger than 10 or negative");

    }
}
