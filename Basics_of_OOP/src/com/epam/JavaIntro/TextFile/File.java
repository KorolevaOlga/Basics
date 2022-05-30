package TextFile;

import java.util.Objects;

public class File {

    String name;
    String author;

    public File() {
    }

    public File(String name, String author) {
        this.name = name;
        this.author = author;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(name, file.name) && Objects.equals(author, file.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", author: " + author + '\n';
    }


}
