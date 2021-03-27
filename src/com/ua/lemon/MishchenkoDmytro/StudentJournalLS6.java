package com.ua.lemon.MishchenkoDmytro;

public class StudentJournalLS6 {

    public StudentLS6[] sortStudentsByMarks(StudentLS6[] students)
    {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length-1; j++) {
                if(students[j].getMark()>students[j+1].getMark())
                {
                    StudentLS6 reservValue = students[j];
                    students[j] = students[j+1];
                    students[j+1] = reservValue;

                }


            }

        }

        return students;
    }

}
