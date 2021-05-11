package com.ua.lemon.kapustnyk.store.dao;

import com.ua.lemon.kapustnyk.store.domain.Laptop;

import java.util.List;

public class LaptopLocalDao implements LaptopDao {

    @Override
    public void addLaptop(Laptop laptop) {
        System.out.println("added");
    }

    @Override
    public List<Laptop> getAll() {
        return null;
    }

    @Override
    public Laptop getLaptopByName(String model) {
        return new Laptop();
    }
}
