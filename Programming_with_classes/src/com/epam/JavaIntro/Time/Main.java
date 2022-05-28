package com.epam.JavaIntro.Time;

/*Составьте описание класса для представления времени. 
Предусмотрите возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут, секунд.
*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        Time watch = new Time(15, 23, 18);
        Time www = new Time(45, 88 , 66);


        System.out.println("Текущее значение часов: ");
        watch.myInfo();

        www.myInfo();

        watch.setHours(35);
        watch.setMinutes(25);
        watch.setSeconds(15);

        watch.myInfo();

        watch.changeHours(45);
        watch.changeMinutes(65);
        watch.changeSeconds(15);

        watch.myInfo();
    }
}
