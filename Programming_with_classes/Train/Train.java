package Program.Train1;


public class Train {
    private final String destination;
    private final int trainNumber;
    private final String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }
    public static void TrainInfo(int number, Train[] trains) {
        for (Train train : trains) {
            if (train.trainNumber == number) {
                System.out.println("Номер поезда: " + train.trainNumber + "\n Пункт назначения: " + train.destination + "\nВремя отправления: " + train.departureTime);
            }
        }

    }

    public static void Sorting(Train[] trains) {
        Train temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].trainNumber > trains[i + 1].trainNumber) {
                    temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                    flag = true;
                }
            }

        }
    }
    public static void printTrains(Train[] trains) {
        for (Train train : trains) {
            System.out.println("Номер поезда: " + train.trainNumber + "\n Пункт назначения: " + train.destination + "\nВремя отправления: " + train.departureTime);
        }
    }

    public static void TrainDestination(Train[] trains) {
        Train temp;
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < trains.length - 1; i++) {
                int comp = trains[i].destination.compareTo(trains[i + 1].destination);
                if (comp > 0) {
                    temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                    flag = true;
                } else if (comp == 0) {
                    if (trains[i].departureTime.compareTo(trains[i + 1].departureTime) > 0) {
                        temp = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = temp;
                        flag = true;
                    }
                }
            }

        }

    }
}

