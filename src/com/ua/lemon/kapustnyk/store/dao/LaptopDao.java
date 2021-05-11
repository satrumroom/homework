package com.ua.lemon.kapustnyk.store.dao;

import com.ua.lemon.kapustnyk.store.domain.Laptop;

import java.util.List;

public interface LaptopDao {

    void addLaptop(Laptop laptop);
    List<Laptop> getAll();
    Laptop getLaptopByName(String model);
}
