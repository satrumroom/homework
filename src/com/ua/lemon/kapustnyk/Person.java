package com.ua.lemon.kapustnyk;

public class Person {

    private int age;
    private double weight;
    private String name;

    public void walk() {
        System.out.println("I'm walking");
    }

    public void talk() {
        System.out.println("I'm " + name);
    }

    private void privateMethod() {

    }

    protected void protMethod() {

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
