package com.ua.lemon.kharkov.Practical_3.domain;

import com.ua.lemon.kharkov.Practical_3.dao.LaptopDao;

import java.io.Serializable;

public class Laptop implements Serializable {

    private static final long serialVersionUID = 4366718818046465395L;
    private int id;
    private String model;
    private double prise;
    private int SN;

    public Laptop(){
    }

    public Laptop(int id, String model, double prise, int SN){
        this.id = id;
        this.model = model;
        this.prise = prise;
        this.SN = SN;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrise() {
        return prise;
    }

    public void setPrise(Double prise) {
        this.prise = prise;
    }

    public Integer getSN() {
        return SN;
    }

    public void setSN(Integer SN) {
        this.SN = SN;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", prise=" + prise +
                ", SN=" + SN +
                '}';
    }
}
