package dop1;

import java.util.Scanner;

public class dop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();
        if (x == 6 || x == 9) {
            System.out.println(x);
        } else {
            if (x > -20 && x < 100) {
                System.out.println(x);
            } else {
                if (x < 100 || x > 1000) {
                    System.out.println(x);
                }
            }
        }
        in.close();
    }
}
