package Program.State;

public class Town {
    enum Type {
        DISTRICT_CENTER,
        REGIONAL_CENTER,
        CAPITAL;
    }
    String name;
    int population;
    int square;
    Type status;

    public Town(String name, int population, int square, Type status) {
        this.name = "" + name;
        this.population = population;
        this.square = square;
        this.status = status;
    }


    @Override
    public String toString() {
        String s = "";
        s += name + ". Население: " + population + ". Площадь: " + square + ". Статус: " + status;
        return s;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }
}
