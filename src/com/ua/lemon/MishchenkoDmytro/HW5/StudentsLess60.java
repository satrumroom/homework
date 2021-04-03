package com.ua.lemon.MishchenkoDmytro.HW5;

public class StudentsLess60{
    private  int countOfBadStudents = 0;

    public int getCountOfBadStudents() {
        return countOfBadStudents;
    }

    public Student[] ArrayWithStudentsLess60 (Student[] arr)
    {

        for (int i = 0; i < Student.count; i++) {
            if(arr[i].getPoints()<60)
                countOfBadStudents++;
        }
        Student[] arrayOfBadStudents = new Student[countOfBadStudents];
        countOfBadStudents = 0;
        for (int i = 0; i < Student.count; i++) {
                if(arr[i].getPoints()<60)
                {
                    arrayOfBadStudents[countOfBadStudents].setPoints(arr[i].getPoints());
                    arrayOfBadStudents[countOfBadStudents].setName(arr[i].getName());
                    arrayOfBadStudents[countOfBadStudents].setSurName(arr[i].getSurName());
                    arrayOfBadStudents[countOfBadStudents].setFatherName(arr[i].getFatherName());
                    arrayOfBadStudents[countOfBadStudents].setGroupNumber(arr[i].getGroupNumber());

                    countOfBadStudents++;
                }


        }
        return arrayOfBadStudents;
    }

}
