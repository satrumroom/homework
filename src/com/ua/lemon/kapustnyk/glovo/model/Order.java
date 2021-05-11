package com.ua.lemon.kapustnyk.glovo.model;

import java.util.List;
import java.util.UUID;

public class Order {

    private transient String orderId;
    private List<String> wishes;
    private String address;
    private String place;

    public Order() {
        this.orderId = UUID.randomUUID().toString();
    }

    public Order(List<String> wishes, String address, String place) {
        this.orderId = UUID.randomUUID().toString();
        this.wishes = wishes;
        this.address = address;
        this.place = place;
    }

    public Order(String orderId, List<String> wishes, String address, String place) {
        this.orderId = orderId;
        this.wishes = wishes;
        this.address = address;
        this.place = place;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<String> getWishes() {
        return wishes;
    }

    public void setWishes(List<String> wishes) {
        this.wishes = wishes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", wishes=" + wishes +
                ", address='" + address + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
