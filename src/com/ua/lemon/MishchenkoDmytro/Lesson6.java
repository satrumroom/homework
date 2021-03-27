package com.ua.lemon.MishchenkoDmytro;

public class Lesson6 {
    public static void main(String[] args) {
        var student1 = new StudentLS6();
        System.out.println(student1.getName());
        var student2 = new StudentLS6("Dima", 5);
        System.out.println(student2.getName());
        System.out.println(student2.getMark());
        var student = new StudentLS6[2];



    }
}
