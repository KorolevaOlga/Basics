package com.epam.JavaIntro.Car.main;

/*2.	Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("Reno", new Engine("GFD123", 1), 5, 20,
                new Wheel("DD", 18, 1), new Wheel("DD", 18, 1),
                new Wheel("DD", 18, 1), new Wheel("DD", 18, 1));


        System.out.println("Информация об автомобиле: ");
        System.out.println(auto);

        auto.start();

        auto.addFuel(15);

        auto.changeWheel(3, "DD", 18, 2);


    }
}

