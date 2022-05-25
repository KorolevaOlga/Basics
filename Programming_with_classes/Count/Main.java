package Program.Count;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод, позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Main {

    public static void main(String[] args) {


        Count first = new Count();

        Count second = new Count(3, 10, 4);


        System.out.println("Текущее значение: ");
        second.value();

        for (int i = 0; i < 10; i++) {
            second.Increase();
        }
        System.out.println("Актуальные данные счетчика");
        second.myInfo();

        for (int i = 0; i < 10; i++) {
            first.Decrease();
        }
        System.out.println("Актуальные данные счетчика");
        first.myInfo();
    }


}


















