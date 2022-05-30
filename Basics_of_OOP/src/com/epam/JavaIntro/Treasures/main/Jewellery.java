package treasures;

import java.util.Objects;

public class Jewellery extends Treasure {

    enum JewelleryType {
        BRACELET,
        RING,
        DIADEM
    }

    private JewelleryType jewellery;

    public Jewellery() {
    }

    public Jewellery(int number, String category, String name, String description, int price, JewelleryType jewellery) {
        super(number, category, name, description, price);
        this.jewellery = jewellery;
    }

    public JewelleryType getJewellery() {
        return jewellery;
    }

    public void setJewellery(JewelleryType jewellery) {
        this.jewellery = jewellery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jewellery)) return false;
        if (!super.equals(o)) return false;
        Jewellery jewellery1 = (Jewellery) o;
        return getJewellery() == jewellery1.getJewellery();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getJewellery());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
