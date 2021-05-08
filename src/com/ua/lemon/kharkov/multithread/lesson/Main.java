package com.ua.lemon.kharkov.multithread.lesson;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(new Random().nextInt(2000));
                System.out.println("Chicken");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ImplThread implThread = new ImplThread();
        Thread t1 = new Thread(implThread);

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
