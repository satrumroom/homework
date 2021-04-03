package com.ua.lemon.kharkov.homework_5.dao;

import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAll();

    void add(Student student);
}
