package com.ua.lemon.kharkov.homework_6;

import java.util.List;
import java.util.Map;

public class Task_3 {
    public static void main(String[] args) {

        List<String> studentName1 = List.of("Anton", "Andrey", "Viki", "Alex");
        List<String> studentName2 = List.of("Harry", "Jack", "Ava", "Emily");
        List<String> studentName3 = List.of("Lily", "Leo", "Mia", "Oscar");
        List<String> studentName4 = List.of("Evie", "John", "Ryan", "Ivy");

        Map<Double, List<String>> studentMap = Map.of(86.7, studentName1,
                90.0, studentName2,
                75.5, studentName3,
                83.0, studentName4
        );

        System.out.println(studentMap);
    }
}
