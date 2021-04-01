package com.lemon;

import java.util.Random;
import java.util.Arrays;

public class task_4 {

    private int[] pack;

    public void numbers(int s) {
        for (int i = 1; i <= s; i++) {
            System.out.print(i + " ");
        }
    }

    public void reversedList(int a) {
        for (int i = a; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public void multiplicationTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + 3 * i);
        }
    }


    public void randomArray(int[] array) {
        int[] num = new int[10];
        Random random = new Random();

        for (int k = 0; k < num.length; k++) {
            num[k] = random.nextInt(80) - 30;
            System.out.print(num[k] + " ");
        }
    }


    public void reversedArray(int[] array) {

        int[] clo = new int[10];
        Random random = new Random();

        for (int k = 0; k < clo.length; k++) {
            clo[k] = random.nextInt(80) - 30;
            System.out.print(clo[k] + " ");
        }
        int n = clo.length;
        int temp;

        for (int i = 0; i < n / 2; i++) {
            temp = clo[n - i - 1];
            clo[n - i - 1] = clo[i];
            clo[i] = temp;
        }

        System.out.println();
        for (int i = 0; i < clo.length; i++) {
            System.out.print(clo[i] + " ");
        }
    }

public void sortArray (int [] clo) {
        int[] num = new int[10];
        Random randoms = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = randoms.nextInt(80) - 30;
            System.out.print(num[i] + " ");
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    int a = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = a;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
        for (int q = 1; q < num.length; q++) {
            for (int w = num.length - 1; w >= q; w--) {
                if (num[w - 1] > num[w]) {
                    int tmp = num[w - 1];
                    num[w - 1] = num[w];
                    num[w] = tmp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
