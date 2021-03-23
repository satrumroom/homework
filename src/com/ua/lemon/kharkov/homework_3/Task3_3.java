package com.ua.lemon.kharkov.homework_3;

import java.util.*;

public class Task3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for the multiplication table: ");
        int number = in.nextInt();

        int i = 1;

        do{
            int rez = number * i;
            System.out.println(number + "*" + i + "=" + rez);
            i ++;
        }while (i < 11);
    }
}
