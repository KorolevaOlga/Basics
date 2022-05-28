package com.epam.JavaIntro.Car.bean;

import java.util.Arrays;
import java.util.Objects;

public class Auto {
    private Engine engine;
    private Wheel wheels[];
    private String brand;
    private double consumption;
    private double level_fuel;

    public Auto() {
    }

    public Auto(String brand, Engine engine, double consumption, double level_fuel, Wheel wheel, Wheel wheel1, Wheel wheel2, Wheel wheel3) {
        this.brand = brand;
        this.engine = engine;
        this.consumption = consumption;
        this.level_fuel = level_fuel;
        this.wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = wheel;

        }
    }


    public void start() {
        if (level_fuel <= 0) {
            System.out.println("Нет топлива. Движение невозможно.");
            return;
        }
        for (int i = 1; i < 4; i++) {
            if (wheels[i].getDiameter() != wheels[i - 1].getDiameter()) {
                System.out.println("Колеса разного диаметра. движение невозможно.");
                return;
            }

        }
        System.out.println("Поехали! Машина может проехать с данным уровнем топлива примерно(км): " + level_fuel / consumption * 100);
    }

    public void addFuel(double value) {
        if (level_fuel + value < 50) {
            level_fuel += value;
            System.out.println("Машина заправлена. Текущий объем топлива: " + level_fuel);
        } else {
            level_fuel = 50;

            System.out.println("Превышен объем бака. Текущий объем топлива: " + level_fuel);
        }

    }

    public double getLevel_fuel() {
        System.out.println(level_fuel);
        return level_fuel;
    }

    public void changeWheel(int number, String brand, double diameter, int type) {
        for (int i = 1; i <= number; i++) {
            Wheel wheel = new Wheel(brand, diameter, type);
            if (i == number) {
                wheels[i] = wheel;
            }
        }
        System.out.println("Колесо под замену: " + number +
                "\n Колесо заменено!");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setLevel_fuel(double level_fuel) {
        this.level_fuel = level_fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return Double.compare(auto.consumption, consumption) == 0 && Double.compare(auto.getLevel_fuel(), getLevel_fuel()) == 0 && Objects.equals(engine, auto.engine) && Arrays.equals(wheels, auto.wheels) && Objects.equals(brand, auto.brand);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(engine, brand, consumption, getLevel_fuel());
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    @Override
    public String toString() {
        return
                engine +
                ", \n Колеса: " + Arrays.toString(wheels) +
                ", \n бренд: " + brand +
                ", \n расход топлива: " + consumption +
                ", \n уровень топлива: " + level_fuel;
    }
}



