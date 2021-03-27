package com.lemon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Количество отработанных часов: ");
        int time = in.nextInt();
        System.out.println("Ставка за час: ");
        int stable = in.nextInt();
        int brutto = time * stable;
        double tax = brutto * 0.05;
        double result = brutto - tax - 1300;
        System.out.println("Ваша сумма после уплаты налогов: " + result);
        System.out.println("Сумма до уплаты налога: " + brutto);
        System.out.println("Уплачены налог 5% от ЗП: " + tax + " и + 1300 второго налога");

        in.close();
    }
}
