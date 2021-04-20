package com.ua.lemon.kapustnyk.onion.domain;

import java.util.Comparator;

public class StudentSortByMark implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        Double d1 = o1.getMark();
        Double d2 = o2.getMark();
        return d2.compareTo(d1);
    }
}
