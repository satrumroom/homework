package com.ua.lemon.podplietnii.homework_5;

public class Student implements Comparable<Student> {

    private final String name;
    private final String surname;
    private final String patronymic;
    private final String group;
    private final int mark;

    public Student(String surname, String name, String patronymic, String group, int mark) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.group = group;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", group='" + group + '\'' +
                ", mark=" + mark +
                '}';
    }

    public int getMark() {
        return mark;
    }

    @Override
    public int compareTo(Student o) {
        int result = this.surname.compareTo(o.surname);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
