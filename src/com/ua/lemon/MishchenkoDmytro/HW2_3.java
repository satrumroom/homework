package com.ua.lemon.MishchenkoDmytro;

import java.util.Scanner;
public class HW2_3 {

    public static void main(String[] args) {
        int day;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day");
        day = in.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wendsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");

        }


    }

}
