package com.ua.lemon.kharkov;

import java.util.*;

public class Task2_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        if (number >= 0 && number < 10) {
            System.out.println("Положительное число меньше 10");
        }
        else{
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
