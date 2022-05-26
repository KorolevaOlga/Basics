package Program.State;

import java.util.ArrayList;

public class State {
    String name;
    ArrayList<Region> regions;
    Town center;
    int population;
    int square;


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

    @Override
    public String toString() {
        String s = "";
        s += "Информация о стране \n" + "Название: " + name + "\n Области: " + regions.toString() +
                "Столица: " + center + "\n Количество населения: " + population + "\n" + "Площадь: " + square;
        return s;
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
}
