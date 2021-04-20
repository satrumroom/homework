package com.ua.lemon.kapustnyk.onion.dao;

import com.ua.lemon.kapustnyk.onion.domain.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getAll();

    void add(Student student);

    void delete(Student student);
}
