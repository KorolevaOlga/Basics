package com.epam.JavaIntro.TextFile.main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        TextFile note1 = new TextFile("About myself", "noName", "Популярные фразы в рассказе о себе",
                "Now I would like to tell you about my hobbies. – Теперь я хотел бы рассказать вам о моих увлечениях.\n" +
                        "What about my character, I am a kind person. – Что касается моего характера, я добрый человек.\n" +
                        "My family is very important for me. – Моя семья очень важна для меня.");

        TextFile note2 = new TextFile("About myself1", "noName", "Популярные фразы в рассказе о себе",
                "Now I would like to tell you about my hobbies. – Теперь я хотел бы рассказать вам о моих увлечениях.\n" +
                        "What about my character, I am a kind person. – Что касается моего характера, я добрый человек.\n" +
                        "My family is very important for me. – Моя семья очень важна для меня.");

        Directory text = new Directory("Text", new ArrayList<>());


        text.addFile(note1);
        text.addFile(note2);

        TextFile note3 = TextFile.create("Кошка", "Яна", "Кошка сама по себе", "Кошки - независимые существа. Их поведение малоизучено.");

        text.addFile(note3);
        note3.renameText("Кошка.2.0");
        note3.supplement(" Они питаются мелкой добычей.");

        note3.printTextFile();
        text.dellText(note3);

    }

}
