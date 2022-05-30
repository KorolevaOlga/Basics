package com.epam.JavaIntro.TextFile.bean;

import java.util.Objects;


public class TextFile extends File {

    private String header;
    private String body;

    public TextFile() {
    }

    public TextFile(String name, String author, String header, String body) {
        super(name, author);

        this.header = header;
        this.body = body;
    }


    public static TextFile create(String name, String author, String header, String body) {
        TextFile text = new TextFile(name, author, header, body);

        return text;

    }

    public void printTextFile() {
        System.out.println("Заголовок: " + getHeader() + '\n' + "Текст: " + getBody() + '\n');
    }

    public void renameText(String newName) {
        super.name = newName;

    }

    public void supplement(String s) {
        body += s;
    }


    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(header, textFile.header) && Objects.equals(body, textFile.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), header, body);
    }

    @Override
    public String toString() {
        return "TextFile{" + "name" + name + '\'' +
                "author" + author + '\'' +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
