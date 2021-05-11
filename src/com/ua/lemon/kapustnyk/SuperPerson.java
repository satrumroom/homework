package com.ua.lemon.kapustnyk;

public class SuperPerson extends NewPerson {

    static {
        System.out.println("In static super person");
    }

    {
        a = 5;
        System.out.println("In super person");
    }

    public SuperPerson() {
        super(1,4);
        System.out.println("In default super");
    }

    public void hello() {
        super.hello();
        System.out.println("hello children");
    }

    public void say() {
        this.hello();
        super.hello();
    }
}
