package com.ua.lemon.kapustnyk;

import com.ua.lemon.kapustnyk.poly.Usb;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Sergio", 81.8);
        Student s2 = new Student("Ivan", 95.8);
        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;
        // System.out.println(s1);

        StudentJournal studentJournal = new StudentJournal();
        System.out.println(Arrays.toString(students));
        Student[] sortedStudent = studentJournal.sortStudentsByMark(students);
        System.out.println(Arrays.toString(sortedStudent));

        new Usb() {
            @Override
            public void connect() {

            }
        };


        Arrays.sort(sortedStudent, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
    }

    static int[] generateArray(int size, int maxValue) {
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(maxValue);
        }

        return result;
    }

    static void printArray(int[] array, String delimiter) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + delimiter);
        }
        System.out.println();
    }

    static void printArray(int[] array) {
        printArray(array, "\t");
    }

    static int getMaxValueFromArray(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    static void printAll(int... arr) {
        printArray(arr);
    }


}
