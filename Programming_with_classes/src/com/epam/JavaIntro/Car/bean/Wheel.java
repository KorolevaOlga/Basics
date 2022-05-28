package com.epam.JavaIntro.Car.bean;

import java.util.Objects;

public class Wheel {
    private String brand;
    private double diameter;
    private String type;

    public Wheel() {
    }

    public Wheel(String brand, double diameter, int type) {
        this.brand = brand;
        this.diameter = diameter;
        if(type == 1) {
            this.type = "Зимнее";
        }
        if(type == 2) {
            this.type = "Летнее";
        }
    }

    public double getDiameter() {
        return diameter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wheel)) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.getDiameter(), getDiameter()) == 0 && Objects.equals(brand, wheel.brand) && Objects.equals(type, wheel.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, getDiameter(), type);
    }

    @Override
    public String toString() {
        return "Колесо: " +
                "бренд: " + brand +
                ", диаметр: " + diameter +
                ", тип:" + type + "\n";
    }
}
