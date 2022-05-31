package com.epam.JavaIntro.Flowers.bean;

import java.util.Objects;

public class Flower {

   public enum Color{
        RED,
        BLUE,
        PINK,
        YELLOW,
        WHITE
    }
    public enum NameFlower {
        ROSE,
        LILY,
        HYDRANGEA,
        TULIP,
        GYPSOPHILA
    }

    private NameFlower nameFlower;
    private Color color;
    public double price;

    public Flower(NameFlower nameFlower, Color color, double price) {
        this.nameFlower = nameFlower;
        this.color = color;
        this.price = price;
    }

    public Flower() {
        this.nameFlower = null;
        this.color = null;
        this.price = 0;
    }

    public NameFlower getName() {
        return nameFlower;
    }

    public void setName(NameFlower nameFlower) {
        this.nameFlower = nameFlower;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.price, price) == 0 && Objects.equals(getName(), flower.getName()) && color == flower.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), color, price);
    }

    @Override
    public String toString() {
        return  "\n" + "Flower{" +
                "name='" + nameFlower + '\'' +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
