package com.ua.lemon.podplietnii.first.homework;

import java.util.Scanner;

public class Practice1_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hoursCount;
        int salaryPerHour;
        int firstTax;
        int secondTax = 1300;
        int salary;
        int totalSalary;

        System.out.print("Enter the number of hours worked: ");
        hoursCount = scan.nextInt();
        System.out.print("Enter your salary per hour: ");
        salaryPerHour = scan.nextInt();

        salary = salaryPerHour * hoursCount;
        firstTax = salary / 100 * 5;
        totalSalary = salary - firstTax - secondTax;

        System.out.println(" ");
        System.out.println("You earned without tax: " + salary);
        System.out.println("The first tax is: " + firstTax);
        System.out.println("The second tax is: " + secondTax);
        System.out.println("Your salary after taxes is: " + totalSalary);
    }
}
