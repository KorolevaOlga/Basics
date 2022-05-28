package com.epam.JavaIntro.test2;
/*Создайте класс Test2 с 2 переменными. Добавьте конструктор с входными параметрами. 
Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
*/

public class Test2 {
    private int one;
    private int second;

    Test2(){
    }

    Test2(int one2, int second2) {
        one = one2;
        second = second2;
    }

    Test2() {
        one = 18;
        second = 30;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getOne() {
        return one;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }


}
