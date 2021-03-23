package com.ua.lemon.MishchenkoDmytro;

import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        int day;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day");
        day = in.nextInt();
        if(day == 1)
            System.out.println("Monday");
        else if(day == 2)
            System.out.println("Tuesday");
        else if(day == 3)
            System.out.println("Wendsday");
        else if(day==4)
            System.out.println("Thursday");
        else if(day==5)
            System.out.println("Friday");
        else
            System.out.println("Weekend");
    }

}
