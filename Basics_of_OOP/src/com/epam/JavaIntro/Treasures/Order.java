package treasures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {

    private int id;
    private static int nextId = 1;
    private List<Treasure> orderTreasures;
    private int moneyAmount;


    public Order(int moneyAmount) {
        this.id = nextId;
        nextId++;
        this.orderTreasures = new ArrayList<Treasure>();
        this.moneyAmount = moneyAmount;
    }

    public Order() {
    }

    public List<Treasure> getOrderTreasures() {
        return orderTreasures;
    }

    public void setOrderTreasures(List<Treasure> orderTreasures) {
        this.orderTreasures = orderTreasures;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = nextId;
        nextId++;
    }

    public void addTreasure(Treasure treasure) {
        orderTreasures.add(treasure);

    }

    public List<Treasure> getTreasures() {
        return orderTreasures;
    }

    public void setTreasures() {
        this.orderTreasures = new ArrayList<Treasure>();
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void info() {
        System.out.println(orderTreasures.toString());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getId() == order.getId() && getMoneyAmount() == order.getMoneyAmount() && Objects.equals(getTreasures(), order.getTreasures());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTreasures(), getMoneyAmount());
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", treasures=" + orderTreasures +
                ", moneyAmount=" + moneyAmount +
                '}';
    }
}
