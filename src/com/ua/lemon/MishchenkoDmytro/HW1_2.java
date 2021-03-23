package com.ua.lemon.MishchenkoDmytro;

import java.util.Scanner;

public class HW1_2 {
    public static void main(String[] args) {

        int hourWorked;
        double moneyPerHour;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many hours have you worked");
        hourWorked = in.nextInt();
        System.out.println("Enter how many money you are paid per hour");
        moneyPerHour = in.nextInt();
        double res = hourWorked*moneyPerHour;

        double firstRes = res - (res*5/100);
        double secondRes = firstRes - 1300;

        System.out.println("Your salary "+ secondRes);
        System.out.println("First tax " + (res*5/100));
        System.out.println("Second tax " + 1300);

    }
}
