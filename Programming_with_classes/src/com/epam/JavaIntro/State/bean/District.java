package com.epam.JavaIntro.State.bean;

import java.util.Objects;

public class District {

    String name;
    int population;
    int square;
    Town center;

    public District() {
    }

    public District(String name, int population, int square, Town center) {
        this.name = name;
       this.population = population;
       this.square = square;
       this.center = center;
    }

    public String getName() {
        return name;
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

    public Town getCenter() {
        return center;
    }

    public void setCenter(Town center) {
        this.center = center;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof District)) return false;
        District district = (District) o;
        return getPopulation() == district.getPopulation() && getSquare() == district.getSquare() && Objects.equals(getName(), district.getName()) && Objects.equals(getCenter(), district.getCenter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPopulation(), getSquare(), getCenter());
    }

    @Override
    public String toString() {
        String s = "\n";
        s += name + ". Население: " + population + ". Площадь: " + square + " . Административный центр: " + center;
        return s;
    }
}
