package com.ua.lemon.podplietnii.fourth.homework;

import java.util.Arrays;
import java.util.Random;

public class Count {
    int[] array = new int[10];

    public void count(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print(i + "   ");
        }
    }

    public void invertedCount(int a) {
        for (int i = a; i > 0; i--) {
            System.out.print(i + "   ");
        }
    }

    public void multiplyTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("⇒  %d * %d = %d\n", a, i, a * i);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
        }
    }

    public void randomArray() {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(80) - 30;
        }

        System.out.println("Randomly filled array: ");
        System.out.println(Arrays.toString(array));
    }


    public void invertedArray() {

        for (int i = 0; i < array.length / 2; i++) {
            int intermediateValue = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = intermediateValue;
        }

        System.out.println("Inverted array: ");
        System.out.println(Arrays.toString(array));

    }

    public void sortArray() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int intermediateValue = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = intermediateValue;
                }
            }
        }
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }

    public void sortInvertedArray() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int intermediateValue = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = intermediateValue;
                }
            }
        }
        System.out.println("Sorted inverted array: ");
        System.out.println(Arrays.toString(array));
    }
}