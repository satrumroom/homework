package task4;

import java.util.Random;

public class task4 {

    public static void main(String[] args) {
        int[] num = new int[10];
        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(80) - 30;
            System.out.println(num[i]);
        }
    }
}
