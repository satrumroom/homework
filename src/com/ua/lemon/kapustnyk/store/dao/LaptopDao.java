package com.ua.lemon.kapustnyk.store.dao;

import com.ua.lemon.kapustnyk.store.domain.Laptop;

public interface LaptopDao {

    void addLaptop(Laptop laptop);

    Laptop getLaptopByName(String model);
}
