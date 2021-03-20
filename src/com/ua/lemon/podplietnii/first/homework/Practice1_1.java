package com.ua.lemon.podplietnii.first.homework;

import java.util.Scanner;

public class Practice1_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName ;
        String surname ;
        String patronymic ;
        int age;
        int birthYear;

        System.out.print("Enter your first name: ");
        firstName = scan.next();
        System.out.print("Enter your surname: ");
        surname = scan.next();
        System.out.print("Enter your patronymic: ");
        patronymic = scan.next();
        System.out.print("Enter your age: ");
        age = scan.nextInt();

        birthYear = 2021 - age;

        System.out.printf("Hello, %s %s %s ,who was born in %d year.", firstName, surname, patronymic, birthYear);

    }
}
