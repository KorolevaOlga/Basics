package flovers.flowers.src.Program;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    List<Flower> flowers;
    Wrapper wrapper;

    public Bouquet(List<Flower> flowers, Wrapper wrapper) {
        this.flowers = flowers;
        this.wrapper = wrapper;
    }

    public Bouquet() {
        this.flowers = new ArrayList<Flower>();
        this.wrapper = null;
    }

    public double countPrice() {
        double sum = 0.0;
        for (int i = 0; i < flowers.size(); i++) {
            sum += flowers.get(i).price;
        }
        return sum;
    }



    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                "\n wrapper=" + wrapper.type +
                "\n price =" + (countPrice() + wrapper.price) +
                '}';
    }
}

