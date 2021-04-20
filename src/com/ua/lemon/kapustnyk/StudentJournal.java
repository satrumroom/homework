package com.ua.lemon.kapustnyk;

import com.ua.lemon.kapustnyk.onion.domain.Student;

public class StudentJournal {

    public Student[] sortStudentsByMark(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getMark() < students[j + 1].getMark()) {
                    Student temp = students[j + 1];
                    students[j + 1] = students[j];
                    students[j] = temp;
                }
            }
        }

        return students;
    }
}
