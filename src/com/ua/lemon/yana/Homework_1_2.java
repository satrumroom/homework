package com.ua.lemon.yana;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework_1_2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input hours: ");
    double hours = in.nextInt();
    System.out.println("Input salary per hour:");
    double salaryPerHour = in.nextDouble();
    double totalSalary = hours * salaryPerHour;
    double tax1 = totalSalary * 0.05;
    double tax2 = 1500;
    double gainedSalary = totalSalary - tax1 - tax2;
        System.out.println("Your salary is: " + totalSalary);
        System.out.println("Tax №1: " + tax1);
        System.out.println("Tax №2: " + tax2);
        System.out.println("Total: " + gainedSalary);


 }
}
