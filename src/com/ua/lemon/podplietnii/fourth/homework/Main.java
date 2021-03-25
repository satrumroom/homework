package com.ua.lemon.podplietnii.fourth.homework;

public class Main {

    public static void main(String[] args) {
        Count num = new Count();
        int [] array = new int[10];

        System.out.println("\n● First task  ↓ ");
        num.count(5);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("\n● Second task ↓ ");
        num.invertedCount(5);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("\n● Third task  ↓ ");
        num.multiplyTable(3);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("\n● Fourth task ↓ ");
        num.randomArray(array);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("\n● Fifth task  ↓");
        num.invertedArray(array);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("\n● Sixth task  ↓");
        num.sortArray(array);
        num.sortInvertedArray(array);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}