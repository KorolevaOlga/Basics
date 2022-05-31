package com.epam.JavaIntro.Flowers.bean;

import java.util.Objects;

public class Wrapper {
    public enum Type{
        PAPER,
        CELLOPHANE,
        CRAFT_PAPER
    }
    public Type type;
    public double price;

    public Wrapper(Type type, double price) {
        this.type = type;
        this.price = price;
    }

    public Wrapper() {
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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
        if (!(o instanceof Wrapper)) return false;
        Wrapper wrapper = (Wrapper) o;
        return Double.compare(wrapper.getPrice(), getPrice()) == 0 && getType() == wrapper.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getPrice());
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
