package com.ua.lemon.podplietnii.second.homework;

import java.util.Scanner;

public class Practice2_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a;

        System.out.println("Enter your number: ");
        a = scan.nextInt();

        if (a >= 0 && a < 10) {
            System.out.print("Positive number less than 10");
        } else {
            System.out.println("Positive number greater than 10 or negative");
        }
    }
}
