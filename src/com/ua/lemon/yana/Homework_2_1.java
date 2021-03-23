package com.ua.lemon.yana;
import java.util.Scanner;

public class Homework_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number > 0 && number < 10) {
            System.out.println("Положительное число меньше 10");
        }else{
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
