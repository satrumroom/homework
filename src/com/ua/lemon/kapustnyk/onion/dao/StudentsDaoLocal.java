package com.ua.lemon.kapustnyk.onion.dao;

import com.ua.lemon.kapustnyk.onion.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsDaoLocal implements StudentDao {

    private List<Student> list = new ArrayList<>();

    public List<Student> getAll() {
        return list;
    }

    public void add(Student student) {
        list.add(student);
    }

    public void delete(Student student) {
        list.remove(student);
    }
}
