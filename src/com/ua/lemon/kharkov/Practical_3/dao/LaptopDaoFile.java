package com.ua.lemon.kharkov.Practical_3.dao;

import com.ua.lemon.kharkov.Practical_3.Main;
import com.ua.lemon.kharkov.Practical_3.domain.Laptop;
import com.ua.lemon.kharkov.Practical_3.сatchError.LaptopNotFoundException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LaptopDaoFile implements LaptopDao {

    private List<Laptop> laptopList = new ArrayList<>();
    private List<Laptop> readLaptop = new ArrayList<>();

    OutputStream outputStream = null;
    ObjectOutputStream objectOutputStream = null;
    InputStream inputStream = null;
    ObjectInputStream objectInputStream = null;

    public void WriteLaptopFile() {
        try {
            outputStream = new FileOutputStream("laptop.txt");
            objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(laptopList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Main.main();
    }

    public void ReadLaptopFile() {
        try {
            inputStream = new FileInputStream("laptop.txt");
            objectInputStream = new ObjectInputStream(inputStream);

            readLaptop = (List<Laptop>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addLaptop(Laptop laptop) {
        laptopList.add(laptop);
    }

    @Override
    public List<Laptop> getAll() {
        ReadLaptopFile();
        return readLaptop;
    }

    @Override
    public Laptop getLaptopByModel(String model) throws LaptopNotFoundException {

        if (readLaptop.isEmpty()) {
            ReadLaptopFile();
        }

        for (Laptop laptop : readLaptop) {
            if (laptop.getModel().equalsIgnoreCase(model)) {
                return laptop;
            }
        }
        return null;
    }
}
