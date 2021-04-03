package com.ua.lemon.kharkov.homework_5.dao;

import com.ua.lemon.kharkov.homework_5.Main;
import com.ua.lemon.kharkov.homework_5.domain.Student;

import java.util.Scanner;
import java.util.List;

public class AddNewStudent{
    public static StudentDao studentList = new StudentDaoLocal();

    public static void main(String ... args) {
        defoultStudents();
        while (true) {
            Scanner in = new Scanner(System.in);

            String name;
            String surname;
            String patronymic;
            int group;
            double grade;

            System.out.print("Enter name: ");
            name = in.nextLine();
            System.out.print("Enter surname: ");
            surname = in.nextLine();
            System.out.print("Enter patronymic: ");
            patronymic = in.nextLine();
            System.out.print("Enter group: ");
            group = in.nextInt();
            System.out.print("Enter grade: ");
            grade = in.nextDouble();

            Student s1 = new Student(name, surname, patronymic, group, grade);
            studentList.add(s1);
            System.out.println(studentList.getAll());
            System.out.println("Student added successfully.");

            String choice;
            System.out.println("Add another student? (Yes|No).");
            choice = in.next();

            if (choice.equalsIgnoreCase("No")) {
                Main.main();
            }
        }
    }

    public static void defoultStudents(){
        Student s2 = new Student("Ivan","Gram","Golden",1,78.6);
        Student s3 = new Student("Andrey","Hlam","Gray",1,94.5);
        Student s4 = new Student("Segey","Johan","Leiwyd",2,55.1);
        Student s5 = new Student("Max","Klaim","Sakers",2,60);
        Student s6 = new Student("Pain","Jaidan","Blaiden",3,59.5);
        Student s7 = new Student("Anton","Prim","Kimel",3,80.4);
        Student s8 = new Student("Vika","Golub","Stark",4,89);
        Student s9 = new Student("Ira","Klint","Liont",4,95);
        Student s10 = new Student("Nik","Raind","YanHo",5,50.5);
        Student s11 = new Student("Inna","Regul","Max",5,73.7);

        //StudentDao studentList = new StudentDaoLocal();
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);
        studentList.add(s8);
        studentList.add(s9);
        studentList.add(s10);
        studentList.add(s11);
    }

    public static List<Student> getAll(){
        return studentList.getAll();
    }
}

