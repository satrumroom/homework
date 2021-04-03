package com.ua.lemon.kharkov.homework_5.dao;

import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoLocal implements StudentDao{
    private List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }
}
