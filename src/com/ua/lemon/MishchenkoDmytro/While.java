package com.ua.lemon.MishchenkoDmytro;

public class While {
    public static void main(String[] args) {
        final int a = 57;
        for(int i = a; i<1327; i++)
        {
            if(i%5 == 0)
                continue;
            if(i%33 == 0)
                break;
            System.out.println(i);


        }


    }
}
