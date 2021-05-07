package com.ua.lemon.kharkov.homework_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) throws Task_4 {
        File file = new File("empty.txt");
        if (file.length() == 0){
            throw new Task_4("Empty File");
        }
    }
}
