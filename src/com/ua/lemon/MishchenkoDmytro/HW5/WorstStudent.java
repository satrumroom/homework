package com.ua.lemon.MishchenkoDmytro.HW5;

public class WorstStudent {

    public int findWorstStudent(Student[] arr){

        int worstStudent = arr[0].getPoints();
        for (int i = 1; i <= Student.count; i++) {
            if(worstStudent>arr[i].getPoints())
            {
                worstStudent = arr[i].getPoints();
            }

        }
        return worstStudent;
    }


}
