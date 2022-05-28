package com.epam.JavaIntro/Train;

/*Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Train[] trains = new Train[]{
                new Train("NewYork", 351, "13:50"),
                new Train("LosAngeles", 255, "18:35"),
                new Train("Boston", 453, "18:45"),
                new Train("Boston", 23, "11:20"),
                new Train("Atlanta", 568, "6.40"),
        };

        new MenuTrain(new Scanner(System.in)).start(trains);
    }
}

