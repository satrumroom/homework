package com.ua.lemon.kapustnyk.multithread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable {

    private Integer number;
    private Integer second;
    Lock lock = new ReentrantLock();
    Lock lock2 = new ReentrantLock();
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public Counter(Integer number) {
        this.number = number;
    }

    public Counter(Integer number, Integer second) {
        this.number = number;
        this.second = second;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            increment();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            decrement();
        }
    }


    private void increment() {

        //getDataFromServer()
        try {
            if (lock.tryLock(200, TimeUnit.MILLISECONDS)) {
                lock.lock();
                second--;
                if (lock2.tryLock()) {
                    lock2.lock();
                    number += 10;
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + ": INCREMENT=" + number);
                    lock2.unlock();
                } else {
                    lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
//            if (!lock.tryLock()) {
//                lock.unlock();
//            }

        }
    }

    private void decrement() {
        second++;
        number -= second;
        System.out.println(Thread.currentThread().getName() + ": DECREMENT=" + number);
    }
}
