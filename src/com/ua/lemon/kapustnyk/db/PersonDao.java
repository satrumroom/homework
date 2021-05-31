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
    public static final String SELECT_BY_NAME = "select * from person where firstName like ?";
    public static final String INSERT_PERSON = "INSERT INTO PERSON (firstName, lastName, age) VALUES (?, ?, ?)";
    public static final String DELETE_PERSON = "DELETE FROM PERSON WHERE ID = ?";

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
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
            Person person = getPersonFromResultSet();
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

    public void addPerson(Person person) {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement(INSERT_PERSON);

            preparedStatement.setString(1, person.getFirstName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setInt(3, person.getAge());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Person> getByName(String name) {
        List<Person> result = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement(SELECT_BY_NAME);

            preparedStatement.setString(1, name);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Person person = getPersonFromResultSet();
                result.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public void deleteById(int id) {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement(DELETE_PERSON);

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private Person getPersonFromResultSet() {
        int id = 0;
        String firstName = null;
        String lastName = null;
        int age = 0;
        try {
            id = resultSet.getInt("id");
            firstName = resultSet.getString("FIRSTNAME");
            lastName = resultSet.getString("LASTNAME");
            age = resultSet.getInt("age");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new Person(id, firstName, lastName, age);
    }

    private void loadDriver() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
