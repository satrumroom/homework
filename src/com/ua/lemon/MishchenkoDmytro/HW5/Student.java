package com.ua.lemon.MishchenkoDmytro.HW5;

public class Student implements Human {

    @Override
    public void info() {
        System.out.println("I'm student");
    }
    static int count = 0;
    private String name;
    private String surName;
    private String fatherName;
    private int groupNumber;
    private int points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Student(){
        count++;
    }
 /*   public Student(String name,String surName,String fatherName,int groupNumber, int points){
        System.out.println("You have created a student with characteristics");
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.groupNumber = groupNumber;
        this.points = points;
    }*/

}
