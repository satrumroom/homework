package com.ua.lemon.kharkov.Lesson.dao;


import com.ua.lemon.kharkov.Lesson.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoLocal implements StudentDao{
    private List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) {students.add(student);}

    @Override
    public List<Student> getAll() {return students;}
}
