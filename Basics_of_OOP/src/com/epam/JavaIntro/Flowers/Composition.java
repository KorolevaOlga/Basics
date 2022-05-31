package flovers.flowers.src.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Composition {
   public List<Flower> flowers;

    public Composition(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Composition(){
        this.flowers = new ArrayList<Flower>();
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Composition)) return false;
        Composition that = (Composition) o;
        return Objects.equals(getFlowers(), that.getFlowers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlowers());
    }

    @Override
    public String toString() {
        return "Composition{" +
                "flowers=" + flowers +
                '}';
    }
}

