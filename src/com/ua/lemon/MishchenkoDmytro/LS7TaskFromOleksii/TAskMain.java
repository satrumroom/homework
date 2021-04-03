package com.ua.lemon.MishchenkoDmytro.LS7TaskFromOleksii;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class TAskMain {

    public static void main(String[] args) {
        ElementsForTask list = new ElementsForTask();
        List<Integer> myList = new ArrayList<Integer>();
        list.getElements(myList,-30,80,10);
       /* List<Integer> myList = new ArrayList<Integer>(list.getElements(-30,80,2));*/
     /*   for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList+" ");
        }*/

    }

}
