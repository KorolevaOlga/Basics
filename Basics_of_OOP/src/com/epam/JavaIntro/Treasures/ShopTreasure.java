package treasures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ShopTreasure {

    Order order;
    ArrayList<Treasure> treasures;

    public ShopTreasure() {
    }

    public ShopTreasure(Order order, ArrayList<Treasure> treasures) {
        this.order = order;
        this.treasures = treasures;
    }

    public void showAll(int number) {
        List<Treasure> result = new ArrayList<Treasure>();

        for (Treasure treasure : treasures) {
            if (number == 1 && treasure.category.equals("Украшение")) {
                result.add(treasure);
            }
            if (number == 2 && treasure.category.equals("Посуда")) {
                result.add(treasure);
            }
            if (number == 3 && treasure.category.equals("Деньги")) {
                result.add(treasure);
            }
            if (number == 4 && treasure.category.equals("Камни")) {
                result.add(treasure);
            }
            if (number == 5 && treasure.category.equals("Слиток")) {
                result.add(treasure);
            }
            if (number == 6) {
                break;
            }
        }
        System.out.println(result);
    }

    public void showMaxExpensive() {
        int tmp = 1;
        for (Treasure treasure : treasures) {
            int max = 0;

            if (treasure.price > max) {
                max = treasure.price;
            }
            if (tmp < max)
                tmp = max;
        }
        for (Treasure treasure : treasures) {
            if (treasure.price == tmp) {
                System.out.println("Самое дорогое украшение: " + treasure);
            }
        }
    }

    public void add() {
        int sum2 = order.getMoneyAmount();

        while (sum2 != 0) {
            System.out.println("Введите номер сокровища:");
            Scanner scan = new Scanner(System.in);
            int b = scan.nextInt();
            if (b != 0) {
                if (treasures.get(b).price <= sum2) {
                    order.addTreasure(treasures.get(b));
                    sum2 -= treasures.get(b).price;
                    System.out.println("Добавлено. Свободные средства: " + sum2);
                    System.out.println("Для возврата в предыдущее меню нажмите 0");
                } else {
                    System.out.println("Выберите сокровище на меньшую или равную остатку сумму: " + sum2);
                    System.out.println("Для возврата в предыдущее меню нажмите 0");
                }
            } else {
                break;
            }
        }
    }

    public void addSelection(int sum) {
        int sum2 = sum;

        while (sum2 != 0) {
            int random = (int) Math.floor(Math.random() * 100);
            if (treasures.get(random).price <= sum2) {
                order.addTreasure(treasures.get(random));
                sum2 -= treasures.get(random).price;
                System.out.println("Добавлено сокровище: " + treasures.get(random));
            }
        }

    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShopTreasure)) return false;
        ShopTreasure that = (ShopTreasure) o;
        return Objects.equals(order, that.order) && Objects.equals(treasures, that.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, treasures);
    }

    @Override
    public String toString() {
        return "ShopTreasure{" +
                "order=" + order +
                ", treasures=" + treasures +
                '}';
    }
}

