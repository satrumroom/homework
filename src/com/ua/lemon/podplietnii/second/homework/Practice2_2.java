package com.ua.lemon.podplietnii.second.homework;

import java.util.Scanner;

public class Practice2_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a;

        System.out.print("Enter a number from 1 to 7: ");
        a = scan.nextInt();

        if (a >= 1 && a <= 7){
            if (a == 1){
                System.out.println("Monday");
            }else if (a == 2){
                System.out.println("Tuesday");
            }else if (a == 3){
                System.out.println("Wednesday");
            }else if (a == 4){
                System.out.println("Thursday");
            }else if (a == 5){
                System.out.println("Friday");
            }else if (a == 6 || a == 7){
                System.out.println("Weekend");
            }
        }else {
            System.out.println("You entered the wrong number");
        }
    }
}
