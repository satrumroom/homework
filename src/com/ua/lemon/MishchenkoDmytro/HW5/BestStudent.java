package com.ua.lemon.MishchenkoDmytro.HW5;

public class BestStudent {

    public int findBestStudent(Student[] arr){

        int bestStudent = arr[0].getPoints();
        for (int i = 1; i <= Student.count; i++) {
            if(bestStudent<arr[i].getPoints())
            {
                bestStudent = arr[i].getPoints();
            }

        }
        return bestStudent;
    }

}
