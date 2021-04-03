package com.ua.lemon.kharkov.homework_5;

import com.ua.lemon.kharkov.homework_5.dao.ChoiceMenu;
import com.ua.lemon.kharkov.homework_5.dao.StudentJurnal;
import com.ua.lemon.kharkov.homework_5.dao.FullStudentsList;
import com.ua.lemon.kharkov.homework_5.dao.SortStudentsMark;
import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.*;

public class Main {
    public static List<Student> students = StudentJurnal.getAll();

    public static void main(String ... args) {
        Scanner in = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\t*** Choose an action ***\n" +
                    "1) Add new student.\n" +
                    "2) Sort by last name.\n" +
                    "3) Sort by rating.\n" +
                    "4) Find the most successful.\n" +
                    "5) Find the most lagging behind.\n" +
                    "6) Find students with a grade less than 60.\n" +
                    "7) Find students with a grade over 90.\n" +
                    "8) Full list of students.\n" +
                    "9) Exit.");
            System.out.print("Enter menu number you want: ");
            choice = in.nextInt();
            if (choice <= 0 || choice > 9){
                System.out.println("Invalid number.");
            }else {
                switch (choice){
                    case (1):
                        StudentJurnal.addNewStudents();
                    case (2):
                        //SortStudentsByLastName.main(students);
                    case (3):
                        List<Student> studentsSortMark = StudentJurnal.startSortStudentByMark();
                        System.out.println(studentsSortMark);
                        ChoiceMenu.choiceManu();
                    case (8):
                        FullStudentsList.main();
                    case (9):
                        System.exit(0);
                }
            }
        }
    }
}