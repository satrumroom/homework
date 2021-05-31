package com.ua.lemon.kapustnyk.collections;

import com.ua.lemon.kapustnyk.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Person p1 = new Person(33, 56.6, "Ivan");
//        Person p2 = new Person(66, 126.6, "Sergio");
//        Person p3 = new Person(77, 36.7, "Denys");
//
//        Set<Person> personSet = new TreeSet<>((o1, o2) -> {
//            Integer age1 = o1.getAge();
//            Integer age2 = o2.getAge();
//
//            return age1.compareTo(age2);
//        });
//        Set<Person> personSetDefault = new TreeSet<>();
//
//        personSet.add(p1);
//        personSet.add(p2);
//        personSet.add(p3);
//
//        personSetDefault.add(p1);
//        personSetDefault.add(p2);
//        personSetDefault.add(p3);
//
//        System.out.println(personSet);
//        System.out.println(personSetDefault);

//        Queue<Integer> queue = new PriorityQueue<>();
//        queue.offer(3);
//        queue.add(2);
//        queue.add(4);
//        System.out.println(queue);
//
//        Deque<Integer> deque = new ArrayDeque<>();
//        System.out.println(deque);
//        deque.addFirst(3);
//        deque.add(6);
//        deque.add(2);
//        System.out.println(deque.getFirst());

//        ((LinkedList<Integer>) deque).add(1);
//        System.out.println(deque.pollFirst());
//        System.out.println();
//        System.out.println(deque);

        Map<Integer, String> firstMap = new LinkedHashMap<>();
//        firstMap.put(1, "Hello");
        firstMap.put(2, "Second Int");
        firstMap.put(1, "World");
        firstMap.put(null, "World");
        System.out.println(firstMap.size());
        System.out.println(firstMap.keySet());
        System.out.println(firstMap.values());
        System.out.println(firstMap.containsKey(55));
        System.out.println(firstMap.remove(55));
        System.out.println(firstMap.replace(2, "NewValue"));
        firstMap.clear();

//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(2,1);
//
//        var map2 = Map.of(1, 1, 2, 1);
//        map2.put(1 ,3);
//        System.out.println(map2);
//
//        int a = 4;
//        int b = 0;
//        System.out.println(a / b);

      //  firstMap.put(null, "Second");
//        System.out.println(firstMap);
////        System.out.println(firstMap.get(1));
//        firstMap.forEach((integer, s) -> {
//            System.out.println(s);
//        });

//        Map<Integer, List<List<String>>> lastMap = new HashMap<>();


    }
}
