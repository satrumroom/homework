package com.ua.lemon.MishchenkoDmytro;

import java.util.Objects;

public class StudentLS6 {
    private String name;
    private double mark;
Object o;
    public StudentLS6(){
        System.out.println("I'm default constructor");

    }

    public StudentLS6(String name, double mark) {
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
    public boolean equals(Object o1) {
        if (this == o1) return true;
        if (o1 == null || getClass() != o1.getClass()) return false;
        StudentLS6 that = (StudentLS6) o1;
        return Double.compare(that.mark, mark) == 0 && Objects.equals(name, that.name) && Objects.equals(o, that.o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark);
    }


    @Override
    public String toString() {
        return "StudentLS6{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

}
