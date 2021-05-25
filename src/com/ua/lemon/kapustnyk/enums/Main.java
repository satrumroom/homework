package com.ua.lemon.kapustnyk.enums;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SATURDAY;
        DayOfWeek da3 = DayOfWeek.SATURDAY;
        DayOfWeek day2 = DayOfWeek.valueOf("MONDAY");
//        DayOfWeek day3 = DayOfWeek.valueOf("mONDAY");
//        DayOfWeek day4 = DayOfWeek.valueOf("ONDAY");
//        System.out.println(day);
//        System.out.println(day.ordinal());
//        System.out.println(day2.ordinal());
//        System.out.println(day2.getRusName());
//        System.out.println(Arrays.toString(DayOfWeek.values()));
//        System.out.println(day == da3);
//        System.out.println(day3);
//        System.out.println(day4);

        isHoliday(DayOfWeek.FRIDAY);
        isHoliday(DayOfWeek.TUESDAY);
    }

    private static void isHoliday(DayOfWeek dayOfWeek) {
        if (dayOfWeek.isHoliday()) {
            System.out.println(dayOfWeek.getRusName() + " выходной");
        }
    }
}
