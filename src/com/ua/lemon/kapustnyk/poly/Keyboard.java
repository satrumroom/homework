package com.ua.lemon.kapustnyk.poly;

public class Keyboard implements Usb, Bluetooth {
    @Override
    public void connect() {
        System.out.println("Keyboard connected");
    }

    @Override
    public void connectRemote() {
        System.out.println("Remote connected");
    }
}
