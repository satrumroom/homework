package com.ua.lemon.kapustnyk;

public class Person implements Comparable<Person> {

    private int age;
    private double weight;
    private String name;

    public Person() {
    }

    public Person(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

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

    @Override
    public int compareTo(Person personToCompare) {
        return this.name.compareTo(personToCompare.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
