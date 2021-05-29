package com.ua.lemon.kharkov.Practical_3.dao;

import com.ua.lemon.kharkov.Practical_3.domain.Laptop;
import com.ua.lemon.kharkov.Practical_3.сatchError.LaptopNotFoundException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LaptopDaoDb implements LaptopDao{

    public static final String URL = "jdbc:h2:~/laptop";
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "";


    @Override
    public void addLaptop(Laptop laptop) {

    }

    @Override
    public List<Laptop> getAll(){
        try{
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        var url = URL;
        var username = USERNAME;
        var password = PASSWORD;

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from leptop");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        ArrayList<Laptop> arrayList = new ArrayList<>();

        while (true){
            int id = 0;
            String model = null;
            double price = 0;
            int sn = 0;

            try {
                if(!resultSet.next()) break;
                id = resultSet.getInt("id");
                model = resultSet.getNString("model");
                price = resultSet.getDouble("price");
                sn = resultSet.getInt("sn");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            Laptop laptop = new Laptop(id, model, price, sn);
            arrayList.add(laptop);
        }

        try {
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return arrayList;
    }

    @Override
    public Laptop getLaptopByModel(String model) throws LaptopNotFoundException {
        return null;
    }

    @Override
    public void deleteById(int id) {
        try{
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        var url = URL;
        var username = USERNAME;
        var password = PASSWORD;

        Connection connection = null;
        Statement statement = null;
        boolean resultSet = true;

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            resultSet = statement.execute("delete from leptop where id = " + id);
            System.out.println("Laptop " + id + " delete.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            connection.close();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Optional<Laptop> findLaptopByModel(String model) {

        try{
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        var url = URL;
        var username = USERNAME;
        var password = PASSWORD;

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from leptop where model Like '" + model + "'%");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return Optional.empty();
    }
}
