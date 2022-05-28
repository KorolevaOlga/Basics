package com.epam.JavaIntro.State.bean;

import java.util.Objects;

public class Town {


    String name;
    int population;
    int square;
    Type status;

    public Town() {
    }

    public Town(String name, int population, int square, Type status) {
        this.name = "" + name;
        this.population = population;
        this.square = square;
        this.status = status;
    }

    enum Type {
        DISTRICT_CENTER,
        REGIONAL_CENTER,
        CAPITAL;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public Type getStatus() {
        return status;
    }

    public void setStatus(Type status) {
        this.status = status;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }
    @Override
    public String toString() {
        String s = "";
        s += name + ". Население: " + population + ". Площадь: " + square + ". Статус: " + status;
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Town)) return false;
        Town town = (Town) o;
        return getPopulation() == town.getPopulation() && getSquare() == town.getSquare() && Objects.equals(getName(), town.getName()) && getStatus() == town.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPopulation(), getSquare(), getStatus());
    }
}
