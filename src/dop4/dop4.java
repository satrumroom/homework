package dop4;

import java.util.Scanner;

public class dop4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 1");
        int num1 = in.nextInt();
        if (num1 == 1) {
        System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели число не равное 1");
        }

        in.close();
    }
}
