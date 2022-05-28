package Program.State;

import java.util.ArrayList;
import java.util.Objects;

public class State {

    String name;
    ArrayList<Region> regions;
    Town center;
    int population;
    int square;

    public State() {
    }

    public State(String name, ArrayList<Region> regions, Town center) {
        this.name = name;
        this.regions = regions;

        this.center = center;
        int count = 0;
        for (int i = 0; i < 7; i++) {
            count += regions.get(i).population;
        }

        this.population = count;

        int count2 = 0;
        for (int i = 0; i < 7; i++) {
            count2 += regions.get(i).square;

        }

        this.square = count2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public Town getCenter() {
        return center;
    }

    public void setCenter(Town center) {
        this.center = center;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void infoCenter() {
        System.out.println("Столица: " + center.name);
    }

    public void regionsCenter() {
        System.out.println("Областные центры и административные единицы, приравненные к ним: ");
        for (Region region : regions) {
            System.out.println(region.getCenter().name);
        }
    }

    public void countRegion() {
        System.out.println("Количество областей: " + regions.size());
    }

    public void getSquare() {
        System.out.println("Площадь: " + square);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State)) return false;
        State state = (State) o;
        return getPopulation() == state.getPopulation() && square == state.square && Objects.equals(getName(), state.getName()) && Objects.equals(getRegions(), state.getRegions()) && Objects.equals(getCenter(), state.getCenter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRegions(), getCenter(), getPopulation(), square);
    }

    @Override
    public String toString() {
        String s = "";
        s += "Информация о стране \n" + "Название: " + name + "\n Области: " + regions.toString() +
                "Столица: " + center + "\n Количество населения: " + population + "\n" + "Площадь: " + square;
        return s;
    }
}
