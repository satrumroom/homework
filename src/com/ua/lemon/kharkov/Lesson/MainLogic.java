package com.ua.lemon.kharkov.Lesson;

import com.ua.lemon.kharkov.Lesson.dao.StudentsMethod;

import java.util.Scanner;

public class MainLogic {
    public static void main(String ... args) {
        Scanner in = new Scanner(System.in);

        int choice;

        StudentsMethod.defoultStudents();

        System.out.println("\t*** Choose an action ***\n" +
                "1) Add new student.\n" +
                "2) Sort students by name.\n" +
                "3) Sort students by last name.\n" +
                "4) Find students with a mark over 60.\n" +
                "5) Find students with a mark less than 30.\n" +
                "6) Full list of students.\n" +
                "7) Exit.");
        System.out.print("Enter menu number you want: ");
        choice = in.nextInt();

        if (choice <= 0 || choice > 7){
            System.out.println("Invalid number.");
        }else {
            switch (choice){
                case (1):
                    StudentsMethod.addNewStudents();
                case (2):
                    StudentsMethod.sortStudentsByName();
                case (3):
                    StudentsMethod.sortStudentsByLastName();
                case (4):
                    StudentsMethod.sortStudentMarkOverSixty();
                case (5):
                    StudentsMethod.sortStudentMarkLessThirty();
                case (6):
                    StudentsMethod.fullStudentsList();
                case (7):
                    System.exit(0);
            }
        }
    }
}
