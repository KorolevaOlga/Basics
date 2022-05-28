package com.epam.JavaIntro.State.bean;

import java.util.ArrayList;

public class Region {

    String name;
    int population;
    int square;
    Town center;
    ArrayList<District> districts;

    public Region() {
    }

    public Region(String name, int population, int square, Town center, ArrayList<District> districts) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.center = center;
        this.districts = districts;
    }

    public String districtInfo() {
        String s = "";
        s += name + districts.toString();
        System.out.println(s);
        return s;
    }

    public Town getCenter() {
        return center;
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

    public void setCenter(Town center) {
        this.center = center;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        String s = "\n";
        s += name + ". Население: " + population + ". Площадь: " + square + ". Административный центр: " + center.name;

        return s;
    }
}
