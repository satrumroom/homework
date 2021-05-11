package com.ua.lemon.kapustnyk.multithread;

import java.util.Random;

public class ImplThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(new Random().nextInt(2000));
                System.out.println("Орел");
            }
        } catch (InterruptedException e) {
            System.out.println("Поток был прерван намеренно");
        }


    }
}
