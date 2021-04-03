package com.ua.lemon.kharkov.Lesson;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        logic(array);
    }

    static void createArray(int[] array){
        Random rand = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(20) - 5;
        }
    }

    static void sortArrayValueMinToMax(int[] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]){
                    int clone = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = clone;
                }
            }
        }
    }

    static int[] arrayArithmeticMean(int[] array){
        int average = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        int[] rez = new int[2];
        rez[0] = sum;
        rez[1] = average;
        return rez;
    }

    static int randomArrayElement(int[] array){
        Random rand = new Random();
        int randIndex = rand.nextInt(array.length -1);
        int number = array[randIndex];
        return number;
    }

    static void logic(int[] array){
        createArray(array);
        System.out.println(Arrays.toString(array));

        sortArrayValueMinToMax(array);
        System.out.println("Min array value: " + array[0]);

        int[] rez = arrayArithmeticMean(array);
        System.out.println("Arithmetic mean of an array " + rez[1]);

        System.out.println("Array sum: " + rez[0]);

        int randNumber = randomArrayElement(array);
        System.out.println("Random array element: " + randNumber);
    }
}