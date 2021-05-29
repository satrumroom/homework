package com.ua.lemon.kharkov.Practical_3.dao;

import com.ua.lemon.kharkov.Practical_3.domain.Laptop;
import com.ua.lemon.kharkov.Practical_3.сatchError.LaptopNotFoundException;

import java.util.List;
import java.util.Optional;

public interface LaptopDao {

    void addLaptop(Laptop laptop);

    List<Laptop> getAll();

    Laptop getLaptopByModel(String model) throws LaptopNotFoundException;

    void deleteById (int id);

    Optional<Laptop> findLaptopByModel(String model);
}
