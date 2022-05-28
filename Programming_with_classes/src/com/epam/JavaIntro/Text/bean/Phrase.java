package com.epam.JavaIntro.Text.bean;

import java.util.Objects;

public class Phrase {
    private String phrase = "";

    public Phrase() {
    }

    public void addWords(Word word) {
        phrase += " " + word.getWord();
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phrase)) return false;
        Phrase phrase1 = (Phrase) o;
        return Objects.equals(getPhrase(), phrase1.getPhrase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhrase());
    }

    @Override
    public String toString() {
        return "Phrase{" +
                "phrase='" + phrase + '\'' +
                '}';
    }
}
