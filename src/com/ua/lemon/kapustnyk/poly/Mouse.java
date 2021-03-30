package com.ua.lemon.kapustnyk.poly;

public class Mouse implements Usb {
    @Override
    public void connect() {
        System.out.println("Mouse connected");
    }
}
