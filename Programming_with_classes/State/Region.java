package Program.State;

import java.util.ArrayList;

public class Region {
    String name;
    int population;
    int square;
    Town center;
    ArrayList<District> districts;


    public Region(String name, int population, int square, Town center, ArrayList<District> districts) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.center = center;
        this.districts = districts;
    }

    @Override
    public String toString() {
        String s = "\n";
        s += name + ". Население: " + population + ". Площадь: " + square + ". Административный центр: " + center.name;

        return s;
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
}
