package Program.Text;

import java.util.Objects;

public class Text {
    private String header;
    private String body = "";


    public Text() {
    }

    public Text(Phrase phrase) {
        header = phrase.getPhrase();
    }

    public Text(Word word) {
        header = word.getWord();
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void addBody(Word word) {
        body += " " + word.getWord();
    }

    public void addBody(Phrase phrase) {
        body += " " + phrase.getPhrase();
    }

    public void additionText(String phrase) {
        body = body + phrase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        Text text = (Text) o;
        return Objects.equals(getHeader(), text.getHeader()) && Objects.equals(getBody(), text.getBody());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeader(), getBody());
    }

    @Override
    public String toString() {
        return "Text{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
