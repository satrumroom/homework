package com.ua.lemon.kharkov.Lesson.domain;

public class Student {
    private String name;
    private String lastName;
    private int group;
    private double mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Student(String name, String lastName, int group, double mark){
        this.name = name;
        this.lastName = lastName;
        this.group = group;
        this.mark = mark;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", last name='" + lastName + '\'' +
                ", group=" + group +
                ", grade=" + mark +
                '}';
    }

    public int compareToLastName(Object o) {
        Student s = (Student) o;
        return this.getLastName().compareTo(s.getLastName());
    }

    public int compareToName(Object o) {
        Student s = (Student) o;
        return this.getName().compareTo(s.getName());
    }
}
