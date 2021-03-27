package task5;

import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(80) - 30;
            System.out.print(num[i] + " ");
        }
        int n = num.length;
        int temp;

        for (int i = 0; i < n / 2; i++) {
            temp = num[n - i - 1];
            num[n - i - 1] = num[i];
            num[i] = temp;
        }

        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
