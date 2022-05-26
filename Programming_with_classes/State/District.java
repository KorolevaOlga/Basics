package Program.State;

public class District {
    String name;
    int population;
    int square;
    Town center;

    public District(String name, int population, int square, Town center) {
        this.name = name;
       this.population = population;
       this.square = square;
       this.center = center;
    }

    @Override
    public String toString() {
        String s = "\n";
        s += name + ". Население: " + population + ". Площадь: " + square + " . Административный центр: " + center;
        return s;
    }
}
