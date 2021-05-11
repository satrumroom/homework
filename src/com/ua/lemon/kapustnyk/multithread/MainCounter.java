package com.ua.lemon.kapustnyk.multithread;

public class MainCounter {

    public static void main(String[] args) {
        Counter counter = new Counter(0, 10);
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);

        t1.start();
        t2.start();
    }
}
