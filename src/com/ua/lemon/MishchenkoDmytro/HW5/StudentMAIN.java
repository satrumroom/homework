package com.ua.lemon.MishchenkoDmytro.HW5;

import javax.swing.text.AbstractDocument;
import java.io.InputStream;
import java.util.Scanner;

public class StudentMAIN {
    public static void main(String[] args) {
        Student[] arr = new Student[10];

        int count = 0;
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Select what you want to do");
        System.out.println("1:Add Student");
        System.out.println("2:Sort by surname and mark");
        System.out.println("3:Find the best student");
        System.out.println("4:Find the worst student");
        System.out.println("5:Find students with mark less than 60");
        System.out.println("6:Find students with mark more than 90");
        System.out.println("7:Show all students");
        boolean enableOfCode = true;
        while (enableOfCode) {
            choice = in.nextInt();
            switch (choice) {
                case 1:

                    arr[count] = new Student();

                    System.out.println("Input name");
                    arr[count].setName(in.next());
                    System.out.println("Input surname");

                    arr[count].setSurName(in.next());
                    System.out.println("Input fathername");

                    arr[count].setFatherName(in.next());
                    System.out.println("Input group number");

                    arr[count].setGroupNumber(in.nextInt());
                    System.out.println("Input point");
                    arr[count].setPoints(in.nextInt());
                 /*   if(arr[Student.count].getPoints()<60) {
                        Less60[reservCount1] = new Student();
                        Less60[reservCount1].setPoints(arr[Student.count].getPoints());
                        Less60[reservCount1].setName(arr[Student.count].getName());
                        Less60[reservCount1].setSurName(arr[Student.count].getSurName());
                        Less60[reservCount1].setFatherName(arr[Student.count].getFatherName());
                        Less60[reservCount1].setGroupNumber(arr[Student.count].getGroupNumber());
                        reservCount1++;
                    }
                    if(arr[Student.count].getPoints()>90) {
                        reservArrMore90[reservCount2] = new Student();
                        reservArrMore90[reservCount2].setPoints(arr[Student.count].getPoints());
                        reservArrMore90[reservCount2].setName(arr[Student.count].getName());
                        reservArrMore90[reservCount2].setSurName(arr[Student.count].getSurName());
                        reservArrMore90[reservCount2].setFatherName(arr[Student.count].getFatherName());
                        reservArrMore90[reservCount2].setGroupNumber(arr[Student.count].getGroupNumber());
                        reservCount2++;
                    }*/

                    Student.count = count;
                    count++;
                    break;
                case 2:

                    SortStudent sortStudent = new SortStudent();

                    arr = sortStudent.sortedArrayOfStudents(arr,count);

                    for (int i = 0; i < count; i++) {
                        System.out.print(arr[i].getSurName() + " " + arr[i].getName() + " " + arr[i].getFatherName() + " " +
                                arr[i].getGroupNumber() + " " + arr[i].getPoints());
                        System.out.println();
                    }



                    break;
                case 3:


                    /*int BestStudent = arr[0].getPoints();
                    for (int i = 1; i < Student.count; i++) {
                        if (BestStudent < arr[i].getPoints()) {
                            BestStudent = arr[i].getPoints();
                        }
                    }*/

                    BestStudent bestStudent = new BestStudent();


                    for (int i = 0; i < count; i++) {
                        if (bestStudent.findBestStudent(arr) == arr[i].getPoints()) {
                            System.out.println("Best student");
                            System.out.println("Name " + arr[i].getName());

                            System.out.println("SurName " + arr[i].getSurName());

                            System.out.println("FatherName " + arr[i].getFatherName());

                            System.out.println("Group Number " + arr[i].getGroupNumber());

                            System.out.println("Point " + arr[i].getPoints());
                        }

                    }


                    break;
                case 4:
                    /*int WorstStudent = arr[0].getPoints();
                    for (int i = 1; i < Student.count; i++) {
                        if (WorstStudent > arr[i].getPoints()) {
                            WorstStudent = arr[i].getPoints();
                        }
                    }*/
                    WorstStudent worstGroupMate = new WorstStudent();

                    for (int i = 0; i < count; i++) {
                        if (worstGroupMate.findWorstStudent(arr) == arr[i].getPoints()) {
                            System.out.println("Worst student");
                            System.out.println("Name " + arr[i].getName());

                            System.out.println("SurName " + arr[i].getSurName());

                            System.out.println("FatherName " + arr[i].getFatherName());

                            System.out.println("Group Number " + arr[i].getGroupNumber());

                            System.out.println("Point " + arr[i].getPoints());
                        }

                    }


                    break;
                case 5:

                    StudentsLess60 el = new StudentsLess60();
                    Student[] Less60;

                    Less60 = el.ArrayWithStudentsLess60(arr,count);

                    for (int i = 0; i < Less60.length; i++) {
                        System.out.print(Less60[i].getSurName()+" "+Less60[i].getName()+" "+
                                Less60[i].getFatherName()+" "+
                                Less60[i].getGroupNumber()+" "+Less60[i].getPoints());
                        System.out.println();
                    }

                   /* int badStudents = 0;

                        for (int i = 0; i < count; i++) {

                            if (arr[i].getPoints() < 60) {

                                Less60[badStudents] = new Student();
                                Less60[badStudents].setPoints(arr[i].getPoints());
                                Less60[badStudents].setName(arr[i].getName());
                                Less60[badStudents].setSurName(arr[i].getSurName());
                                Less60[badStudents].setFatherName(arr[i].getFatherName());
                                Less60[badStudents].setGroupNumber(arr[i].getGroupNumber());

                                badStudents++;
                            }


                        }

                 //   System.out.println(el.getbadStudents());
                    for (int i = 0; i < Less60.length; i++) {
                        System.out.print(Less60[i].getSurName()+" "+Less60[i].getName()+" "+
                                Less60[i].getFatherName()+" "+
                                Less60[i].getGroupNumber()+" "+Less60[i].getPoints());
                        System.out.println();
                    }*/

                    break;

                case 6:
/*
                    for (int i = 0; i < reservCount2; i++) {
                        System.out.print(reservArrMore90[i].getSurName()+" "+reservArrMore90[i].getName()+" "+
                                reservArrMore90[i].getFatherName()+" "+
                                reservArrMore90[i].getGroupNumber()+" "+reservArrMore90[i].getPoints());
                        System.out.println();
                    }

  */
                    var el2 = new StudentsMore90();
                    Student[] More90;

                    More90 = el2.ArrayWithStudentsMore90(arr,count);

                    for (int i = 0; i < More90.length; i++) {
                        System.out.print(More90[i].getSurName()+" "+More90[i].getName()+" "+
                                More90[i].getFatherName()+" "+
                                More90[i].getGroupNumber()+" "+More90[i].getPoints());
                        System.out.println();
                    }



                    break;

                case 7:

                    for (int i = 0; i < count; i++) {
                        System.out.print(arr[i].getSurName() + " " + arr[i].getName() + " " + arr[i].getFatherName() + " " +
                                arr[i].getGroupNumber() + " " + arr[i].getPoints());
                        System.out.println();
                    }


                    break;
                default:
                    System.out.println("Inapropriate choice");
                    enableOfCode = false;
            }
        }
    }
}
