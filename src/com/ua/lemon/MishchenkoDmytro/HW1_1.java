package com.ua.lemon.MishchenkoDmytro;

import java.util.Scanner;

public class HW1_1 {
    public static void main(String[] args) {
        String nameInfo;
        int ageInfo;
        System.out.println("Enter your FIO");
        Scanner in = new Scanner(System.in);
        nameInfo = in.nextLine();

        System.out.println("Enter your age");
        ageInfo = in.nextInt();

        System.out.println("You are "+ nameInfo + " and you were born in "+ (2021-ageInfo));


    }
}
