package com.ua.lemon.kapustnyk;

public class NewPerson {

    protected int a;
    private int b;

    static {
        System.out.println("In static person");
    }

    static {
        System.out.println("In static person 2");
    }

    {
        System.out.println("second new person");
    }

    {
        a = 4;
        System.out.println("In person");
    }


    public NewPerson(int a) {
        this.a = a;
    }

    public NewPerson(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void hello() {
        System.out.println("hello");
    }
}
