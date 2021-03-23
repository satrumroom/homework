package com.ua.lemon.yana;
import java.util.Scanner;

public class Homework_2_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int day = 7;
        switch(number){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Выходной");

        }



    }
}
