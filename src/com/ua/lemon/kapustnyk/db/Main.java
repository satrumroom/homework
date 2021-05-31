package com.ua.lemon.kapustnyk.db;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.getAll();
        System.out.println(personList);

        Person p1 = new Person(0, "Oleg", "Olegov", 22);
        personDao.deleteById(2);
        personList = personDao.getByName("Oleg");
        System.out.println(personList);
    }
}
