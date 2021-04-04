package com.ua.lemon.MishchenkoDmytro.HW5;

public class StudentsLess60{
    private  int count= 0;

    public int getCountOfBadStudents() {
        return count;
    }

    public Student[] ArrayWithStudentsLess60 (Student[] arr, int arrCount)
    {
        int countOfBadStudents = 0;

      //  System.out.println(Student.count);
        for (int i = 0; i < arrCount; i++) {
            if(arr[i].getPoints()<60)
                countOfBadStudents++;
        }
        Student[] arrayOfBadStudents = new Student[countOfBadStudents];
        count = countOfBadStudents;
       countOfBadStudents = 0;

        for (int i = 0; i < arrCount; i++) {

                if(arr[i].getPoints()<60)
                {

                   arrayOfBadStudents[countOfBadStudents] = new Student();
                    arrayOfBadStudents[countOfBadStudents].setPoints(arr[i].getPoints());
                    arrayOfBadStudents[countOfBadStudents].setName(arr[i].getName());
                    arrayOfBadStudents[countOfBadStudents].setSurName(arr[i].getSurName());
                    arrayOfBadStudents[countOfBadStudents].setFatherName(arr[i].getFatherName());
                    arrayOfBadStudents[countOfBadStudents].setGroupNumber(arr[i].getGroupNumber());

                     countOfBadStudents++;
                }


        }
      // System.out.println(arrayOfBadStudents[0].getFatherName());
             return arrayOfBadStudents;
    }

}
