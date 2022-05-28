package Program.Airline;

/*
Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий масив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:
a)список рейсов для заданного пункта назначения;
b)список рейсов для заданного дня недели;
c)список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
import java.util.List;

public class Main {


    public static void main(String[] args) {

        AirlineBase airlines = new AirlineBase();

        airlines.addAirlineBase(new Airline("Стамбул", "B2 783", "Embraer E195", 14.45, "Среда"));
        airlines.addAirlineBase(new Airline("Санкт-Петербург", "B2 939", "Embraer E195", 12.40, "Суббота"));
        airlines.addAirlineBase(new Airline("Кутаиси", "B2 729", "Embraer E175", 22.55, "Среда"));
        airlines.addAirlineBase(new Airline("Стамбул", "B2 783", "Embraer E95", 08.20, "Вторник"));
        airlines.addAirlineBase(new Airline("Москва", "B2 951", "Embraer E195", 12.55, "Среда"));
        airlines.addAirlineBase(new Airline("Стамбул", "B2 783", "Embraer E195", 14.45, "Среда"));
        airlines.addAirlineBase(new Airline("Москва", "B2 951", "Embraer E195", 12.55, "Среда"));

        System.out.println("Список рейсов для заданного направления: ");
        List<Airline> destinationInfo = airlines.destinations("Стамбул");
        for (Airline a: destinationInfo) {
            System.out.println(a.toSting());
        }
        System.out.println();

        System.out.println("Список рейсов для заданного дня недели: ");
        List<Airline> dayWeekInfo = airlines.days("Среда");
        for (Airline a: dayWeekInfo) {
            System.out.println(a.toSting());
        }
        System.out.println();

        System.out.println("Список рейсов для заданного дня недели, время вылета для которых больше заданного: ");
        List<Airline> infoDayAndTime = airlines.daysAndTime("Среда", 10.00);
        for(Airline a: infoDayAndTime){
            System.out.println(a.toSting());
        }
    }


}

