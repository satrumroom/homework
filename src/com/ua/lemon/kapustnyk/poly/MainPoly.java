package com.ua.lemon.kapustnyk.poly;

public class MainPoly {

    public static void main(String[] args) {
//        Figure c1 = new Circle();
//        Figure t1 = new Triangle();
//        Figure s1 = new Square();
//
//        Figure[] figures = new Figure[3];
//        figures[0] = c1;
//        figures[1] = t1;
//        figures[2] = s1;
//
//        for (int i = 0; i < figures.length; i++) {
//            figures[i].hello();
//            figures[i].sayMyName();
//            System.out.println();
//        }

        Usb[] devices = new Usb[3];
        Usb keyboard = new Keyboard();
        Usb mouse = new Mouse();
        Usb superDev = new MySuperDevice();
        devices[0] = keyboard;
        devices[1] = mouse;
        devices[2] = superDev;

        for (int i = 0; i < devices.length; i++) {
            devices[i].connect();
        }

    }
}
