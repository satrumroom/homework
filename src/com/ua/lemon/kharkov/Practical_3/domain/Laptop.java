package com.ua.lemon.kharkov.Practical_3.domain;

import com.ua.lemon.kharkov.Practical_3.dao.LaptopDao;

import java.io.Serializable;

public class Laptop implements Serializable {

    private static final long serialVersionUID = 4366718818046465395L;
    private String model;
    private Double prise;
    private Integer SN;

    public Laptop(){
    }

    public Laptop(String model, Double prise, Integer SN){
        this.model = model;
        this.prise = prise;
        this.SN = SN;
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
                "model='" + model + '\'' +
                ", prise=" + prise +
                ", SN=" + SN +
                '}';
    }
}
