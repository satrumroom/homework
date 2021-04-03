package com.ua.lemon.kharkov.homework_5.dao;

import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.*;

public class SortStudentsMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        Double d1 = o1.getMark();
        Double d2 = o2.getMark();
        return d1.compareTo(d2);
    }

    /*public static void main(List<Student> students) {
        sortStudnetsByMark(students);
        System.out.println(students);

        ChoiceMenu.choiceManu();
    }

    public static void sortStudnetsByMark(List<Student> students){
        *//*for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size() - 1; j++) {
                if (students.get(j).getMark() < students.get(j + 1).getMark()){
                    Student temp = students.get(j + 1);
                    students.get(j + 1) = new Student(students.get(j));
                    students.get(j). = temp;

                }
            }
        }*//*
        *//*Set<Student> sortStudent = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Double d1 = o1.getMark();
                Double d2 = o2.getMark();
                return d1.compareTo(d2);
            }
        });*//*
    }*/
}