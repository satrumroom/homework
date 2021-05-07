package com.ua.lemon.kharkov.homework_7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        readNumberFile();
    }

    public static void readNumberFile(){

        List<Integer> arrayList = new ArrayList();
        int sum;

        try {
            Scanner scanner = new Scanner(new File("number.txt"));

            while (scanner.hasNextInt()){
                arrayList.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        sum = arrayList.stream().mapToInt(integer -> integer).sum();
        System.out.println(sum);
    }
}
