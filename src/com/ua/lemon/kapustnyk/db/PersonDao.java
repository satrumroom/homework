package com.ua.lemon.kapustnyk.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {

    public static final String DRIVER = "org.h2.Driver";
    public static final String URL = "jdbc:h2:~/test";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "";
    public static final String SELECT_ALL = "select * from person";

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;


    public PersonDao() {
        loadDriver();
    }

    public List<Person> getAll() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SELECT_ALL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Person> result = new ArrayList<>();

        while (true) {
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            int id = 0;
            String firstName = null;
            String lastName = null;
            int age = 0;
            try {
                id = resultSet.getInt("id");
                firstName = resultSet.getString("FIRST_NAME");
                lastName = resultSet.getString("LAST_NAME");
                age = resultSet.getInt("age");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            Person person = new Person(id, firstName, lastName, age);
            result.add(person);
        }

        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    private void loadDriver() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
