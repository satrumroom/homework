package com.ua.lemon.kapustnyk.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    static void go(String a) {
        System.out.println("in str");
    }

    static void go(int a) {
        System.out.println("in p");
    }

    static void go(Integer a) {
        System.out.println("in o");
    }

    static void go(Object a) {
        System.out.println("in obj");
    }

    public static void main(String[] args) {
        go((Object) "ss");

//        List<Integer> integers = List.of(1, -5, 4, 9);
//        System.out.println(integers);
//
//        List<Integer> newList = new ArrayList<>();
//        integers.forEach(integer -> {
//            if (integer >= 0) {
//                if (integer % 2 == 0) {
//                    newList.add(integer * integer);
//                } else {
//                    newList.add(integer);
//                }
//            }
//        });
//        //   System.out.println(newList);
//
//        var resultList = integers.stream()
//                .filter(integer -> integer > 0)
//                .map(integer -> integer * integer)
//                .filter(integer -> integer %2 == 0)
//                .collect(Collectors.toList());
//
//        System.out.println(resultList);
//
//        Optional<Integer> positive = integers.stream()
//                .filter(integer -> integer > 0)
//                .findFirst();
//
//        var isTrue = integers.stream()
//                .anyMatch(integer -> integer > 0);
//        System.out.println(isTrue);
//
//        var isAllTrue = integers.stream()
//                .allMatch(integer -> integer > 0);
//        System.out.println(isAllTrue);
//
//        var count = integers.stream()
//                .filter(integer -> integer > 3)
//                .count();
//        System.out.println(count);
//
//
//        List<String> stringList = List.of(" qw", " qwert ", "rgththt  ", "   qq");
//
//        var stringResult = stringList.stream()
//                .map(String::trim)
//                .filter(s -> s.length() > 3)
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        System.out.println(stringResult);
    }


    /*
    создать коллекцию из стрингов разной длинны в количесвте 3-4 элемента
    отфильтровать те строки - длинна которых больше 3 символов
    и занести в новую коллекцию
    вывести на экран
     */
}
