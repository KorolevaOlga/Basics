package Program.Train1;

import java.util.Scanner;

public class MenuTrain {
    private final Scanner scan;

    public MenuTrain(Scanner scan) {
        this.scan = scan;
    }

    private void InMenu() {

        System.out.println("Сведения о поездах: " +
                "\n 1 - Для получения информации по номеру поезда;" +
                        "\n 2 - Для сортировки информации о поездах по пункту назначения " +
                        "\n (Поезда с одинаковыми пунктами назначения упорядочены по времени отправления);" +
                        "\n 3 - Для сортировки информации по номерам поездов;" +
                        "\n 4 - Для выхода из меню"
        );
    }

    public void start(Train[] trains) {
        if (this.scan != null) {
            int key;
            do {
                InMenu();
                System.out.println("Введите цифры согласно запросу: ");
                key = this.scan.nextInt();

                switch (key) {
                    case 1:
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Введите номер поезда: ");
                        int number = scanner.nextInt();
                        Train.TrainInfo(number, trains);
                        System.out.println();
                        break;
                    case 2:
                        Train.TrainDestination(trains);
                        Train.printTrains(trains);
                        System.out.println();
                        break;
                    case 3:
                        Train.Sorting(trains);
                        Train.printTrains(trains);
                        System.out.println();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение для меню \n");
                }

            }while (key != 4);
        }
    }
}