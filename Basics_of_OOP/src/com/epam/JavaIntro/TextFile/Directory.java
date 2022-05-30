package TextFile;

import java.util.List;
import java.util.Objects;

public class Directory {

    String name;
    List<File> documents;

    public Directory() {
    }

    public Directory(String name, List<File> files) {
        this.name = name;
        this.documents = files;

    }

    public void addFile(File file) {
        documents.add(file);

    }

    public void dellText(TextFile name) {
        documents.remove(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getDocuments() {
        return documents;
    }

    public void setDocuments(List<File> documents) {
        this.documents = documents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(name, directory.name) && Objects.equals(documents, directory.documents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, documents);
    }


    @Override
    public String toString() {
        return "Directory: " + '\n' +
                name +
                ", files: " + documents;
    }
}

