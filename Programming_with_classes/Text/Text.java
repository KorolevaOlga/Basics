package Text;

public class Text {
    private String header;
    private String body = "";


    public Text(Phrase phrase){
        header = phrase.getPhrase();
    }

    public Text(Word word) {
        header = word.getWord();
    }

    public String getHeader() {
        return header;
    }

    public void addBody(Word word){
        body += " " + word.getWord();
    }
    public void addBody(Phrase phrase){
        body += " " + phrase.getPhrase();
    }

    public String getBody() {
        return body;
    }

    public void additionText(String phrase) {
        body = body + phrase;
    }
}
