package com.ua.lemon.kapustnyk.exceptions;

import com.ua.lemon.kapustnyk.store.dao.PhoneDao;
import com.ua.lemon.kapustnyk.store.dao.PhoneLocalDao;
import com.ua.lemon.kapustnyk.store.domain.Phone;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(1 / 0);
        System.out.println("end");
        try(InputStream is= new FileInputStream("file.json")) {
            List<?> l = new ArrayList<>();
        } catch (Exception e) {

        }
//        int a = 10;
//        int b = 0;
//        int arr[] = new int[1];
//        try {
//            int c = a / b;
//            System.out.println(arr[20]);
//            // System.out.println(c);
//        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
//            System.out.println("Вы вышли за пределы массива");
//        } catch (Exception e) {
//            System.out.println("Другое исключение");
//        } finally {
//            System.out.println("In finally");
//        }
//        double result = 0;
//        Math m = new Math();
//        try {
//            result = m.divide(4.5, 0);
//        } catch (Exception e) {
//            //result = 9999999999.99;
//        }
//        System.out.println(result);

//        PhoneDao phoneDao = new PhoneLocalDao();
//        try {
//            Phone phone1 = phoneDao.getPhoneByName("samsung");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
        /*
        создать лист из 5 элементов
        заполнить хардкодом
        попытаться обратиться к 20 элементу
        если будет ошибка вывести сообщение об ошибке
        после выввести сообщение "Я закончил выполнение"

         */


    }
}
