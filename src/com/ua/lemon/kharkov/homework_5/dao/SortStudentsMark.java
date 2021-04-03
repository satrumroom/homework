package com.ua.lemon.kharkov.homework_5.dao;

import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.*;

public class SortStudentsMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        Double d1 = o1.getMark();
        Double d2 = o2.getMark();
        return d2.compareTo(d1);
    }
}