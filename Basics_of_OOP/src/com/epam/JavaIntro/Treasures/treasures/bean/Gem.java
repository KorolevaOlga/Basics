package com.epam.JavaIntro.Treasures.treasures.bean;

import java.util.Objects;

public class Gem extends Treasure{
    enum GemType {
        EMERALD,
        DIAMOND,
        RUBY
    }
    GemType gemType;

    public Gem(int number, String category, String name, String description, int price, GemType gemType) {
        super(number, category, name, description, price);
        this.gemType = gemType;
    }

    public GemType getGemType() {
        return gemType;
    }

    public void setGemType(GemType gemType) {
        this.gemType = gemType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gem)) return false;
        if (!super.equals(o)) return false;
        Gem gem = (Gem) o;
        return getGemType() == gem.getGemType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGemType());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
