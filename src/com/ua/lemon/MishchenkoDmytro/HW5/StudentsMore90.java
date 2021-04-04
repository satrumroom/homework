package com.ua.lemon.MishchenkoDmytro.HW5;

public class StudentsMore90 {
    private  int count= 0;

    public int getCountOfGoodStudents() {
        return count;
    }

    public Student[] ArrayWithStudentsMore90 (Student[] arr, int arrCount)
    {
        int countOfGoodStudents = 0;

        //  System.out.println(Student.count);
        for (int i = 0; i < arrCount; i++) {
            if(arr[i].getPoints()>90)
                countOfGoodStudents++;
        }
        Student[] arrayOfGoodStudents = new Student[countOfGoodStudents];
        count = countOfGoodStudents;
        countOfGoodStudents = 0;

        for (int i = 0; i < arrCount; i++) {

            if(arr[i].getPoints()>90)
            {

                arrayOfGoodStudents[countOfGoodStudents] = new Student();
                arrayOfGoodStudents[countOfGoodStudents].setPoints(arr[i].getPoints());
                arrayOfGoodStudents[countOfGoodStudents].setName(arr[i].getName());
                arrayOfGoodStudents[countOfGoodStudents].setSurName(arr[i].getSurName());
                arrayOfGoodStudents[countOfGoodStudents].setFatherName(arr[i].getFatherName());
                arrayOfGoodStudents[countOfGoodStudents].setGroupNumber(arr[i].getGroupNumber());

                countOfGoodStudents++;
            }


        }
        // System.out.println(arrayOfGoodStudents[0].getFatherName());
        return arrayOfGoodStudents;
    }


}
