package dop3;

import java.util.Scanner;

public class dop3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: 1,2 или 3");
        int num1 = in.nextInt();
        System.out.println("Вы ввели число " + num1);
        in.close();
    }
}
