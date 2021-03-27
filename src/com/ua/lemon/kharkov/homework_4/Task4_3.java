package com.ua.lemon.kharkov.homework_4;

import java.util.*;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for the multiplication table: ");
        int number = in.nextInt();

        multiplicatioToEnteredNumber(number);
    }

    static void multiplicatioToEnteredNumber(int number){
        int i = 1;

        do{
            int rez = number * i;
            System.out.println(number + "*" + i + "=" + rez);
            i ++;
        }while (i < 11);
    }
}
