package com.ua.lemon.kapustnyk.multithread;

import java.util.Random;

public class CustomThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from other " + getName());
    }
}
