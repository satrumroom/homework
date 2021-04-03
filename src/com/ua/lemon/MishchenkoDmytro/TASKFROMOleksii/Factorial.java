package com.ua.lemon.MishchenkoDmytro.TASKFROMOleksii;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getList() {
        return list;
    }

    private List<Integer> list = new ArrayList<Integer>();

    public int Fact(int value) {

        List<Integer> tryList = getList();

        if(tryList.size()!=0) {
            for (int i = 0; i < tryList.size(); i++) {
                if ((i % 2 == 0) && (tryList.get(i) == value)) {
                    System.out.println("Was used ");
                    return tryList.get(i+1);
                }

            }
        }


        list.add(value);
        int res = 1;
        for (int i = 1; i <= value; i++) {
            res *= i;
        }
        list.add(res);

        return res;

    }

}
