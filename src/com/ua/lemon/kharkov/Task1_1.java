package com.ua.lemon.kharkov;
import java.util.*;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your surname: ");
        String surname = in.nextLine();

        System.out.print("Enter your patronymic: ");
        String patronymic = in.nextLine();

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        int year = 2021 - age;

        System.out.printf("\nHello %s %s %s.\nYour age: %d.\nYear of birth: %d", surname, name, patronymic, age, year);
    }
}
