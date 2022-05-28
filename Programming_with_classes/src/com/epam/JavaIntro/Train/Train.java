package package com.epam.JavaIntro.Train;


import java.util.Objects;

public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train() {
    }

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }
    public static void trainInfo(int number, Train[] trains) {
        for (Train train : trains) {
            if (train.trainNumber == number) {
                System.out.println("Номер поезда: " + train.trainNumber + "\n Пункт назначения: " + train.destination + "\nВремя отправления: " + train.departureTime);
            }
        }

    }

    public static void sorting(Train[] trains) {
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

    public static void trainDestination(Train[] trains) {
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return getTrainNumber() == train.getTrainNumber() && Objects.equals(getDestination(), train.getDestination()) && Objects.equals(getDepartureTime(), train.getDepartureTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestination(), getTrainNumber(), getDepartureTime());
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}

