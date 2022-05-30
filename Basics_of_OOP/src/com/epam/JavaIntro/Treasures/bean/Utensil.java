package com.epam.JavaIntro.Treasures.bean;

import java.util.Objects;

public class Utensil extends Treasure {

    enum UtensilType {
        CUP,
        DISHES
    }

    private UtensilType utensilType;

    public Utensil() {
    }

    public Utensil(int number, String category, String name, String description, int price, UtensilType utensilType) {
        super(number, category, name, description, price);
        this.utensilType = utensilType;
    }

    public UtensilType getUtensilType() {
        return utensilType;
    }

    public void setUtensilType(UtensilType utensilType) {
        this.utensilType = utensilType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utensil)) return false;
        if (!super.equals(o)) return false;
        Utensil utensil = (Utensil) o;
        return getUtensilType() == utensil.getUtensilType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUtensilType());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
