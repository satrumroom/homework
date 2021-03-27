package task6;

import java.util.Random;

public class task6 {

    public static void main(String[] args) {
        int[] num = new int[10];
        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(80) - 30;
            System.out.print(num[i] + " ");
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    int a = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = a;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
        for (int q = 1; q < num.length; q++) {
            for (int w = num.length - 1; w >= q; w--) {
                if (num[w - 1] > num[w]) {
                    int tmp = num[w - 1];
                    num[w - 1] = num[w];
                    num[w] = tmp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
