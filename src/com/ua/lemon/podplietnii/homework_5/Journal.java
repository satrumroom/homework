package com.ua.lemon.podplietnii.homework_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Journal {
    private final List<Student> list;


    public Journal() {
        list = new ArrayList<>();
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public List<Student> getList() {
        return list;
    }

    public void printJournal() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }

    }

    public void sortStudentsBySurname() {
        Collections.sort(list);
    }

    public void sortStudentsByMark() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getMark() < list.get(j + 1).getMark()) {
                    Student tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }
    }

    public void searchTheMostSuccessfulStudent() {
        int tmp = list.get(0).getMark();
        Student student = null;
        for (int i = 0; i < list.size() - 1; i++) {
            if (tmp < list.get(i + 1).getMark()) {
                tmp = list.get(i + 1).getMark();
                student = list.get(i + 1);
            }
        }
        System.out.println(student);
    }

    public void searchTheMostLaggingStudent() {
        int tmp = list.get(0).getMark();
        Student student = null;
        for (int i = 0; i < list.size() - 1; i++) {
            if (tmp > list.get(i + 1).getMark()) {
                tmp = list.get(i + 1).getMark();
                student = list.get(i + 1);
            }
        }
        System.out.println(student);
    }

    public void searchAllSuccessfulStudents() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMark() >= 90) {
                System.out.println(list.get(i));
            }
        }
    }

    public void searchAllLaggingStudents() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMark() < 60) {
                System.out.println(list.get(i));
            }
        }
    }
}

