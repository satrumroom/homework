package com.ua.lemon.kharkov.Lesson.dao;

import com.ua.lemon.kharkov.Lesson.domain.Student;

import java.util.List;


public interface StudentDao{
    void add(Student student);

    List<Student> getAll();
}

