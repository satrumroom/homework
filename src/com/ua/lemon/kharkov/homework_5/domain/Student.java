package com.ua.lemon.kharkov.homework_5.domain;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private int group;
    private double grade;

    public Student(String name, String surname, String patronymic, int group, double grade){
        this.name = name;
        this.surname= surname;
        this.patronymic = patronymic;
        this.group = group;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", group=" + group +
                ", grade=" + grade +
                '}';
    }
}
