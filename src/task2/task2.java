package task2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int num = in.nextInt();
        if (num == 1) {
            System.out.println("Понедельник");
        } else {
            if (num == 2) {
                System.out.println("Вторник");
            } else {
                if (num == 3) {
                    System.out.println("Среда");
                } else {
                    if (num == 4) {
                        System.out.println("Четверг");
                    } else {
                        if (num == 5) {
                            System.out.println("Пятница");
                        } else {
                            if (num == 6) {
                                System.out.println("Суббота");
                            } else {
                                System.out.println("Воскресенье");
                            }
                        }
                    }
                }
            }
        }
    }
}
