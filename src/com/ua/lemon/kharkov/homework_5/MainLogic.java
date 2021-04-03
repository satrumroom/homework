package com.ua.lemon.kharkov.homework_5;

import com.ua.lemon.kharkov.homework_5.dao.*;
import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.*;

public class MainLogic {
    public static List<Student> students = AddNewStudents.getAll();

    public static void main(String ... args) {
        Scanner in = new Scanner(System.in);
        SortStudentsMark sortStudentsMark = new SortStudentsMark();
        Set<Student> studentsSetMark = new TreeSet<>(sortStudentsMark);
        Set<Student> studentsSetLastName = new TreeSet<>(Student::compareTo);

        int choice;

        while (true) {
            System.out.println("\t*** Choose an action ***\n" +
                    "1) Add new student.\n" +
                    "2) Sort students by last name.\n" +
                    "3) Sort students by mark.\n" +
                    "4) Find the most successful student.\n" +
                    "5) Find the most lagging behind student.\n" +
                    "6) Find students with a mark less than 60.\n" +
                    "7) Find students with a mark over 90.\n" +
                    "8) Full list of students.\n" +
                    "9) Exit.");
            System.out.print("Enter menu number you want: ");
            choice = in.nextInt();

            if (choice <= 0 || choice > 9){
                System.out.println("Invalid number.");
            }else {
                switch (choice){
                    case (1):
                        AddNewStudents.addNewStudents();
                    case (2):
                        for (int i = 0; i < students.size(); i++) {
                            studentsSetLastName.add(students.get(i));
                        }
                        for (int i = 0; i < studentsSetLastName.size(); i++) {
                            System.out.println(studentsSetLastName.toArray()[i]);
                        }
                        ChoiceMenu.choiceManu();
                    case (3):
                    case (4):
                    case (5):
                    // 3
                        for (int i = 0; i < students.size(); i++) {
                            studentsSetMark.add(students.get(i));
                        }
                        if (choice == 3) {
                            for (int i = 0; i < studentsSetMark.size(); i++) {
                                System.out.println(studentsSetMark.toArray()[i]);
                            }
                            ChoiceMenu.choiceManu();
                        }
                    //4
                        if (choice == 4) {
                            System.out.println(studentsSetMark.toArray()[0]);
                            ChoiceMenu.choiceManu();
                        }
                    //5
                        if (choice == 5) {
                            int getIndexStudent = studentsSetMark.size() - 1;
                            System.out.println(studentsSetMark.toArray()[getIndexStudent]);
                            ChoiceMenu.choiceManu();
                        }
                    case (6):
                        SortStudentsByHighAndLowMark.sortStudentsWhoseMarkLowSixty(students);
                    case (7):
                        SortStudentsByHighAndLowMark.sortStudentsWhoseMarkHighNinety(students);
                    case (8):
                        FullStudentsList.fullStudentsList();
                    case (9):
                        System.exit(0);
                }
            }
        }
    }
}