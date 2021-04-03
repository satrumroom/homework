package com.ua.lemon.kharkov.homework_5.dao;

import com.ua.lemon.kharkov.homework_5.Main;

import java.util.Scanner;

public interface ChoiceMenu {
    static void choiceManu(){
        Scanner in = new Scanner(System.in);

        String choice;

        System.out.print("Back to main menu (Y): ");
        choice = in.nextLine();
        while (true) {
            if (choice.equalsIgnoreCase("Y")) {
                Main.main();
            }
            choice = in.next();
        }
    }
}