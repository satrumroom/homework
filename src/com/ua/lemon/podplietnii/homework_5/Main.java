package com.ua.lemon.podplietnii.homework_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Journal journal = new Journal();

        Student student1 = new Student("Ivanov", "Ivan", "Ivanovich", "KS-21", 73);
        Student student2 = new Student("Dmitrov", "Dmitrii", "Dmitrovich", "KS-21", 81);
        Student student3 = new Student("Nikolaiev", "Nikolai", "Nikolaevich", "KS-21", 15);
        Student student4 = new Student("Yevheniev", "Yevhenii", "Yevhenievich", "KS-21", 92);
        Student student5 = new Student("Alexov", "Alex", "Alexeich", "KS-21", 37);
        Student student6 = new Student("Antonov", "Anton", "Antonovich", "KS-21", 62);
        Student student7 = new Student("Sergiov", "Sergio", "Sergiovich", "KS-21", 71);
        Student student8 = new Student("Maximov", "Maxim", "Maximovich", "KS-21", 23);
        Student student9 = new Student("Ashotov", "Ashot", "Ashotovich", "KS-21", 3);
        Student student10 = new Student("Olegov", "Oleg", "Olegovich", "KS-21", 59);
        journal.addStudent(student1);
        journal.addStudent(student2);
        journal.addStudent(student3);
        journal.addStudent(student4);
        journal.addStudent(student5);
        journal.addStudent(student6);
        journal.addStudent(student7);
        journal.addStudent(student8);
        journal.addStudent(student9);
        journal.addStudent(student10);

        while (true) {

            System.out.println("\nВыберите одит из вариантов\n" +
                    "1.добавить студента в журнал\n" +
                    "2.отсортировать по фамилии и оценке\n" +
                    "3.найти самого успешного студента\n" +
                    "4.найти самого отстающего студента\n" +
                    "5.найти студентов с баллом меньше 60\n" +
                    "6.найти студентов с баллом выше 90\n" +
                    "7.вывести полный список студентов\n" +
                    "8.Выход\n" +
                    "Введите число: ");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите имя студента: ");
                    String studentName = scanner.next();
                    System.out.println("Введите фамилию студента: ");
                    String studentSurname = scanner.next();
                    System.out.println("Введите отчество студента: ");
                    String studentPatronymic = scanner.next();
                    System.out.println("Введите группу студента: ");
                    String studentGroup = scanner.next();
                    System.out.println("Введите общюю оценку студента: ");
                    int studentMark = scanner.nextInt();

                    Student newStudent = new Student(studentSurname, studentName, studentPatronymic,
                            studentGroup, studentMark);
                    journal.addStudent(newStudent);

                    break;
                case 2:
                    System.out.println("Если вы хотите отсортировать студентов по фамилии нажмите |1|\n" +
                            "Если вы хотите отсортировать студентов по оценке  нажмите |2|\n" +
                            "Введите число: ");
                    int tmp = scanner.nextInt();
                    switch (tmp) {
                        case 1:
                            journal.sortStudentsBySurname();
                            journal.printJournal();
                            break;
                        case 2:
                            journal.sortStudentsByMark();
                            journal.printJournal();
                            break;

                    }

                    break;
                case 3:
                    journal.searchTheMostSuccessfulStudent();
                    break;
                case 4:
                    journal.searchTheMostLaggingStudent();
                    break;
                case 5:
                    journal.searchAllLaggingStudents();
                    break;
                case 6:
                    journal.searchAllSuccessfulStudents();
                    break;
                case 7:
                    journal.printJournal();
                    break;
                case 8:
                    return;
            }
        }
    }
}
