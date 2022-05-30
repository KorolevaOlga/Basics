package treasures;

import java.util.Objects;

public class Treasure {
    int number;
    String category;
    String name;
    String description;
    int price;

    public Treasure(int number, String category, String name, String description, int price) {
        this.number = number;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Treasure() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Treasure)) return false;
        Treasure treasure = (Treasure) o;
        return getNumber() == treasure.getNumber() && getPrice() == treasure.getPrice() && Objects.equals(getCategory(), treasure.getCategory()) && Objects.equals(getName(), treasure.getName()) && Objects.equals(getDescription(), treasure.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getCategory(), getName(), getDescription(), getPrice());
    }

    @Override
    public String toString() {
        return " \n number = " + number +
                ", category= '" + category + '\''
                + ", '" + name + '\''
                + ", '" + description + '\'' +
                ", price= " + price;

    }
}
