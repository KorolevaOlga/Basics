package treasures;

import java.util.Objects;

public class Bullion extends Treasure {

    enum BullionType {
        GOLD,
        PLATINUM
    }

    private BullionType bullionType;

    public Bullion() {
    }

    public Bullion(int number, String category, String name, String description, int price, BullionType bullionType) {
        super(number, category, name, description, price);
        this.bullionType = bullionType;
    }

    public BullionType getBullionType() {
        return bullionType;
    }

    public void setBullionType(BullionType bullionType) {
        this.bullionType = bullionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bullion)) return false;
        if (!super.equals(o)) return false;
        Bullion bullion = (Bullion) o;
        return getBullionType() == bullion.getBullionType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBullionType());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
