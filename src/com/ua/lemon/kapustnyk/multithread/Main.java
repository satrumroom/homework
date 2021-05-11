package com.ua.lemon.kapustnyk.multithread;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            CustomThread customThread = new CustomThread();
//            customThread.start();
//        }

        Runnable runnableThread = new ImplThread();
        Thread t2 = new Thread(runnableThread);
        Thread t3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {

                try {
                    Thread.sleep(new Random().nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Решка");
            }
        });
        t3.setName("runnable");
        System.out.println(t3.getState());
        t3.setDaemon(true);
        t2.start();
        t3.start();
        System.out.println(t3.getState());
//        try {
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t3.getState());

        t2.interrupt();
        System.out.println(t2.getState());

        System.out.println("Hello world");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
        System.out.println(t2.getState());
    }
}
