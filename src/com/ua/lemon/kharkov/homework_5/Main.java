package com.ua.lemon.kharkov.homework_5;

import com.ua.lemon.kharkov.homework_5.dao.AddNewStudent;
import com.ua.lemon.kharkov.homework_5.dao.FullStudentsList;

import java.util.Scanner;

public class Main {

    public static void main(String ... args) {
        Scanner in = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\t*** Choose an action ***");
            System.out.println("1) Add new student.\n" +
                    "2) Sort by last name.\n" +
                    "3) Sort by rating.\n" +
                    "4) Find the most successful.\n" +
                    "5) Find the most lagging behind.\n" +
                    "6) Find students with a grade less than 60.\n" +
                    "7) Find students with a grade over 90.\n" +
                    "8) Full list of students.\n" +
                    "9) Exit.");
            System.out.print("Enter the number you want: ");
            choice = in.nextInt();
            if (choice <= 0 || choice > 9){
                System.out.println("Invalid number.");
            }else {
                switch (choice){
                    case (1):
                        AddNewStudent.main();
                    case (8):
                        FullStudentsList.main();
                    case (9):
                        System.exit(0);
                }
            }
        }
    }
}
