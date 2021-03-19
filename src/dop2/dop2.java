package dop2;

import java.util.Scanner;

public class dop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое дробное число: ");
        double num1 = in.nextDouble();
        System.out.println("Введите второе дробное число: ");
        double num2 = in.nextDouble();
        System.out.println("Введите третье дробное число: ");
        double num3 = in.nextDouble();
        System.out.printf("%.0f %.0f %.0f \n", num3, num2, num1);
        in.close();
    }
}
