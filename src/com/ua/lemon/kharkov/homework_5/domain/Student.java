package com.ua.lemon.kharkov.homework_5.domain;

import java.util.List;

public class Student implements Comparable{
    private String name;
    private String lastName;
    private String patronymic;
    private int group;
    private double mark;

    public Student(String name, String surname, String patronymic, int group, double grade){
        this.name = name;
        this.lastName = surname;
        this.patronymic = patronymic;
        this.group = group;
        this.mark = grade;
    }

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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = this.mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", last name='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", group=" + group +
                ", grade=" + mark +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.getLastName().compareTo(s.getLastName());
    }
}