package com.ua.lemon.MishchenkoDmytro.HW5;

public class SortStudent {

    public Student[] sortedArrayOfStudents(Student[] arr, int count)
    {

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count-1; j++) {
                if(arr[j].getPoints()>arr[j+1].getPoints()){
                    int ReservValueGroup = arr[j].getGroupNumber();
                    int ReservValuePoints = arr[j].getPoints();
                    String ReservName = arr[j].getName();
                    String ReservSurName = arr[j].getSurName();
                    String ReservFatherName = arr[j].getFatherName();

                    arr[j].setPoints(arr[j+1].getPoints());
                    arr[j].setGroupNumber(arr[j+1].getGroupNumber());
                    arr[j].setName(arr[j+1].getName());
                    arr[j].setSurName(arr[j+1].getSurName());
                    arr[j].setFatherName(arr[j+1].getFatherName());

                    arr[j+1].setPoints(ReservValuePoints);
                    arr[j+1].setGroupNumber(ReservValueGroup);
                    arr[j+1].setName(ReservName);
                    arr[j+1].setSurName(ReservSurName);
                    arr[j+1].setFatherName(ReservFatherName);



                }

            }

        }


        return arr;
    }


}
