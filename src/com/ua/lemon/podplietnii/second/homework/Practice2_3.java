package com.ua.lemon.podplietnii.second.homework;

import java.util.Scanner;

public class Practice2_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a;

        System.out.print("Enter a number from 1 to 7: ");
        a = scan.nextInt();

        switch (a) {
            case (1):
                System.out.println("Monday");
                break;
            case (2):
                System.out.println("Tuesday");
                break;
            case (3):
                System.out.println("Wednesday");
                break;
            case (4):
                System.out.println("Thursday");
                break;
            case (5):
                System.out.println("Friday");
                break;
            case (6):
                System.out.println("Saturday");
                break;
            case (7):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You entered the wrong number");
                break;
        }

    }
}
