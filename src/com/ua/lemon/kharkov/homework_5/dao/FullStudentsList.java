package com.ua.lemon.kharkov.homework_5.dao;

import com.ua.lemon.kharkov.homework_5.Main;
import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.List;
import java.util.Scanner;

public class FullStudentsList {
    public static void main(String ... args) {
        Scanner in = new Scanner(System.in);
        List<Student> students = AddNewStudent.getAll();

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("\nNumber of students: " + students.size());

        String choice;
        System.out.print("Back to main menu (Y): ");
        choice = in.nextLine();
        while (true) {
            if (choice.equalsIgnoreCase("Y")) {
                Main.main();
            }
            choice = in.next();
        }
    }
}