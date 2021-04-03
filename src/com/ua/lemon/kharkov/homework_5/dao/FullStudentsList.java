package com.ua.lemon.kharkov.homework_5.dao;

import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.List;

public class FullStudentsList implements ChoiceMenu {
    public static void main(String ... args) {
        List<Student> students = StudentJurnal.getAll();

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("\nNumber of students: " + students.size());

        ChoiceMenu.choiceManu();
    }
}