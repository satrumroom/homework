package com.ua.lemon.kapustnyk;

import com.ua.lemon.kapustnyk.onion.domain.Student;
import com.ua.lemon.kapustnyk.onion.domain.StudentSortByMark;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Student[] students = new Student[2];
//        students[0] = s1;
//        students[1] = s2;
//        // System.out.println(s1);
//
//        StudentJournal studentJournal = new StudentJournal();
//        System.out.println(Arrays.toString(students));


//        StudentDao<Student> studentsDao = new StudentsDaoLocal();
//
//        studentsDao.add(s1);
//
//        Student student1 = studentsDao.getAll()[0];
//        System.out.println(student1);

//        List<Student> studentList = new LinkedList<>();
//        System.out.println(studentList.size());
//        studentList.add(s1);
//        System.out.println(studentList);
//        System.out.println(studentList.size());
//        ArrayList<Student> sl = new ArrayList<>();
//        sl.trimToSize();
        Student s1 = new Student("Sergio", 81.8);
        Student s2 = new Student("Ivan", 95.8);
        Student s3 = new Student("Marko", 13);
        Set<Student> studentSet = new TreeSet<>((o1, o2) -> {
            Double d1 = o1.getMark();
            Double d2 = o2.getMark();
            return d1.compareTo(d2);
        });

        List.of(new int[5]);

        //создать лист из double и заполнить его 10 000 элементами

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
//        studentSet.add(7);
//        studentSet.add(3);
//
//        for (int i = 0; i < 30; i++) {
//            studentSet.add(i);
//        }

        System.out.println(studentSet);

    }

    static int[] generateArray(int size, int maxValue) {
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(maxValue);
        }

        return result;
    }

    static void printArray(int[] array, String delimiter) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + delimiter);
        }
        System.out.println();
    }

    static void printArray(int[] array) {
        printArray(array, "\t");
    }

    static int getMaxValueFromArray(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    static void printAll(int... arr) {
        printArray(arr);
    }


}
