package com.ua.lemon.kharkov;
import java.util.*;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of hours worked: ");
        int hour = in.nextInt();

        System.out.print("Enter rate per hour: ");
        double salary = in.nextDouble();

        double allSalary = hour * salary;
        double firstTax = allSalary * 5 / 100;
        int secondTax = 1300;
        double endSalary = allSalary - firstTax - secondTax;

        System.out.printf("\nYour salary: %.2f uah.\nFirst tax = %.2f uah.\nSecond tax = %d uah." +
                "\nAmount after all taxes = %.2f uah.", allSalary, firstTax, secondTax, endSalary);
    }
}
