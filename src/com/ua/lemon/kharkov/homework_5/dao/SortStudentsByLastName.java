package com.ua.lemon.kharkov.homework_5.dao;

import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.*;

public class SortStudentsByLastName implements ChoiceMenu {
    public static void sortStudentsByLastName(List<Student> students){
        Set<Student> sortStudent = new TreeSet<>(Student::compareTo);
    }
}
