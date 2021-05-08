package com.ua.lemon.kharkov.multithread.lesson;

import java.util.Random;

public class ImplThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(new Random().nextInt(2000));
                System.out.println("Egg");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
