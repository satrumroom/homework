package com.ua.lemon.MishchenkoDmytro.LS7TaskFromOleksii;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElementsForTask implements MainInterface {

    @Override
    public List<Integer> getElements(List<Integer> list,int minValue, int maxValue, int amountOfElements) {

        list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < amountOfElements; i++) {
            list.add(rand.nextInt(maxValue)+minValue);
        }

        return list;

    }



}
