package com.ua.lemon.kharkov.homework_5.dao;

import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortStudentsByHighAndLowMark {
    public static void sortStudentsWhoseMarkLowSixty(List<Student> students){
        SortStudentsMark sortStudentsMark = new SortStudentsMark();
        Set<Student> lowMarkGroup = new TreeSet<>(sortStudentsMark);

        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getMark() < 60){
                lowMarkGroup.add(students.get(i));
            }
        }

        for (int i = 0; i < lowMarkGroup.size(); i++) {
            System.out.println(lowMarkGroup.toArray()[i]);
        }
        System.out.println("\nNumber of students: " + lowMarkGroup.size());

        ChoiceMenu.choiceManu();
    }

    public static void sortStudentsWhoseMarkHighNinety(List<Student> students){
        SortStudentsMark sortStudentsMark = new SortStudentsMark();
        Set<Student> highMarkGroup = new TreeSet<>(sortStudentsMark);

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMark() > 90) {
                highMarkGroup.add(students.get(i));
            }
        }

        for (int i = 0; i < highMarkGroup.size(); i++) {
            System.out.println(highMarkGroup.toArray()[i]);
        }
        System.out.println("\nNumber of students: " + highMarkGroup.size());

        ChoiceMenu.choiceManu();
    }
}
