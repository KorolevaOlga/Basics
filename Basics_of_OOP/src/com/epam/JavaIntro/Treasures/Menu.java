package treasures;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    private void TreasureMenu() {
        System.out.println("Для создания заказа нажмите 1" +
                "\n Для просмотра своего заказа нажмите 2" +
                "\n Для просмотра сокровищ нажмите 3" +
                "\n Для просмотра самого дорогого сокровища нажмите 4" +
                "\n Для добавления сокровищ наберите 5" +
                "\n Для автоматического подбора сокровищ на указанную сумму нажмите 6" +
                "\n Для выхода нажмите 0");
    }

    public void start() {
        System.out.println("Создайте заказ. Для этого укажите сумму заказа: ");
        Order order = new Order(scanner.nextInt());
        Cave cave = new Cave();
        cave.adder();
        ShopTreasure one = new ShopTreasure(order, cave.getTreasures());
        if (this.scanner != null) {
            int key;
            do {
                TreasureMenu();
                Scanner scan = new Scanner(System.in);
                System.out.println("\n Введите цифру необходимой операции: ");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:

                        break;
                    case 2:
                        System.out.println(order.getOrderTreasures());
                        break;
                    case 3:
                        System.out.println("Введите цифру категори сокровищ." +
                                "\n 1 - украшения" +
                                "\n 2 - посуда" +
                                "\n 3 - деньги" +
                                "\n 4 - камни" +
                                "\n 5 - слиток");
                        one.showAll(scan.nextInt());
                        break;
                    case 4:
                        one.showMaxExpensive();
                        break;
                    case 5:
                        one.add();
                        break;
                    case 6:
                        System.out.println("Укажите желаемую сумму покупок(не более суммы на счету): ");
                        one.addSelection(scan.nextInt());
                        break;
                }

            } while (key != 0);
        }
    }
}

