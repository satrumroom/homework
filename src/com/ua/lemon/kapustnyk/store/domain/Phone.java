package com.ua.lemon.kapustnyk.store.domain;

import java.io.Serializable;

public class Phone implements Serializable {

    private static final long serialVersionUID = 2938170767077973314L;

    private String model;
    private double price;

    public Phone() {
    }

    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
