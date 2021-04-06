package com.ua.lemon.kharkov.Lesson.dao;


import com.ua.lemon.kharkov.Lesson.MainLogic;
import com.ua.lemon.kharkov.Lesson.domain.Student;

import java.util.*;

public class StudentDaoLocal implements StudentDao{
    private List<Student> students = new ArrayList<>();

    private static StudentDao studentList = new StudentDaoLocal();

    public static void defoultStudents() {
        Student s2 = new Student("Ivan", "Gram", 1, 20);
        Student s3 = new Student("Andrey", "Hlam", 1, 94.5);
        Student s4 = new Student("Segey", "Johan", 2, 25);
        Student s5 = new Student("Max", "Klaim", 2, 61);
        Student s6 = new Student("Pain", "Jaidan", 3, 59.5);

        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
    }

    public static void addNewStudents(){
        Scanner in = new Scanner(System.in);

        String name;
        String lastName;
        int group;
        double mark;

        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter surname: ");
        lastName = in.nextLine();
        System.out.print("Enter group: ");
        group = in.nextInt();
        System.out.print("Enter grade: ");
        mark = in.nextDouble();
        while (mark < 0 || mark > 100){
            System.out.println("\t\t***Mistake***\nEnter a mark between 0 and 100.");
            mark = in.nextDouble();
        }

        Student s1 = new Student(name, lastName, group, mark);
        studentList.add(s1);
        System.out.println("Student added successfully.");
        returnMain();
    }

    public static void fullStudentsList(){
        studentList.getAll().forEach(System.out::println);
        returnMain();
    }

    public static void sortStudentsByLastName(){
        Set<Student> sortStudents = new TreeSet<>(Student::compareToLastName);
        returnMain();
    }

    public static void sortStudentsByName(){
        Set<Student> sortStudents = new TreeSet<>(Student::compareToName);
        returnMain();
    }

    public static void sortStudentMarkOverSixty(){
        studentList.getAll().forEach(student -> {
            if (student.getMark() > 60){
                System.out.println(student);
            }
        });
        returnMain();
    }

    public static void sortStudentMarkLessThirty(){
        studentList.getAll().forEach(student -> {
            if (student.getMark() < 30){
                System.out.println(student);
            }
        });
        returnMain();
    }

    public static void returnMain(){
        System.out.println("\n\n");
        MainLogic.main();
    }

    @Override
    public void add(Student student) {students.add(student);}

    @Override
    public List<Student> getAll() {return students;}
}
