package com.ua.lemon.kapustnyk.store.dto;

import com.ua.lemon.kapustnyk.store.domain.Laptop;
import com.ua.lemon.kapustnyk.store.domain.Phone;

import java.util.List;

public class OrderDto {
    private List<Phone> phones;
    private List<Laptop> laptops;

    public OrderDto() {
    }

    public OrderDto(List<Phone> phones, List<Laptop> laptops) {
        this.phones = phones;
        this.laptops = laptops;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "phones=" + phones +
                ", laptops=" + laptops +
                '}';
    }
}
