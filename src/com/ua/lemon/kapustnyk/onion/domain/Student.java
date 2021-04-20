package com.ua.lemon.kapustnyk.onion.domain;

import java.util.Objects;

public class Student implements Comparable{

    private String name;
    private double mark;

    public Student() {
        System.out.println("I'm default constructor");
        name = "n1";
        mark = 2.0;
    }

    public Student(String name, double mark) {
        System.out.println("I'm full constructor");
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.mark, mark) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.getName().compareTo(s.getName());
    }
}
