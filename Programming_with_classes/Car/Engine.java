package Car;

import java.util.Objects;

public class Engine {

    private String numberVIN = "";
    private String typeFuel;

    public Engine(String numberVIN, int typeFuel) {
        this.numberVIN += numberVIN;
        if(typeFuel == 1)
        this.typeFuel = "Petrol";
        if(typeFuel == 2)
            this.typeFuel = "Diesel";
        if(typeFuel == 3) {
            this.typeFuel = "Gas";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return Objects.equals(numberVIN, engine.numberVIN) && Objects.equals(typeFuel, engine.typeFuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberVIN, typeFuel);
    }

    @Override
    public String toString() {
        return "\nДвигатель: " + numberVIN + "\nТип топлива: " + typeFuel;
    }
}

