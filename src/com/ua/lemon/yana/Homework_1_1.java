package com.ua.lemon.yana;
import com.ua.lemon.kapustnyk.Person;
import com.ua.lemon.kapustnyk.Student;

import java.time.LocalDate;
import java.util.Scanner;
public class Homework_1_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your surname: ");
        String surname = in.nextLine();
        System.out.print("Enter your patronymic: ");
        String patronymic = in.nextLine();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int yearOfBirth = year - age;
        System.out.println("Hello, dear " + surname + " " + name + " " + patronymic + "!");
        System.out.println("Year of birth is - " + yearOfBirth);
    }
}
