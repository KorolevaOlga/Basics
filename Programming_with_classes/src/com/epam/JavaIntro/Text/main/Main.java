package com.epam.JavaIntro.Text.main;

/*	Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Main {

    public static void main(String[] args) {

        Word word1 = new Word("Очень");
        Word word2 = new Word("ветрено");

        Phrase phraseHeader = new Phrase();
        phraseHeader.addWords(word1);
        phraseHeader.addWords(word2);

        Text head = new Text(phraseHeader);

        Word word3 = new Word("Сегодня");
        Word word4 = new Word("очень");
        Word word5 = new Word("сильный");
        Word word6 = new Word("ветер.");

        Phrase inBodies = new Phrase();
        inBodies.addWords(word3);
        inBodies.addWords(word4);
        inBodies.addWords(word5);
        inBodies.addWords(word6);

        head.addBody(inBodies);

        System.out.println(head.getHeader());
        System.out.println(head.getBody());

        head.additionText(" Рекомендуется воздержаться от прогулок.");

        System.out.println(head.getBody());


    }
}
