package com.lemon;

public class task_4_main {
    public static void main(String[] args) {
        task_4 print = new task_4();
        int[] array = new int[10];

        System.out.println("task 1: ");
        print.numbers(5);

        System.out.println();


        System.out.println("task 2: ");
        print.reversedList(5);

        System.out.println();


        System.out.println("task 3: ");
        print.multiplicationTable(3);


        System.out.println("task 4: ");
        print.randomArray(array);

        System.out.println();


        System.out.println("task 5: ");
        print.reversedArray(array);

        System.out.println();

        System.out.println("task 6:");
        print.sortArray(array);


    }
}
