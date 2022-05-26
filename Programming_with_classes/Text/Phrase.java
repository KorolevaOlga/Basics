package Text;

public class Phrase {
    private String phrase = "";

    public void addWords(Word word) {
        phrase += " " + word.getWord();
    }

    public String getPhrase() {
        return phrase;
    }
}
