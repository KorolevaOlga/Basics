package Book;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). 
Создать второй класс, агрегирующий масив типа Book, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(авторы), издательство, год издания, количество страниц, цена, тип переплета.

Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

import java.util.List;

public class Main {


    public static void main(String[] args) {

        BookBase books = new BookBase();

        books.addBookBase(new Book("Зеленая миля", "Стивен Кинг", "АСТ", 2014, 384, 15.90, "Мягкий"));
        books.addBookBase(new Book("Зеленая миля", "Стивен Кинг", "АСТ", 2020, 368, 30.60, "Твердый"));
        books.addBookBase(new Book("Маленький принц", "Антуан де Сент-Экзюпери", "Эксмо", 2011, 160, 15.40, "Твердый"));
        books.addBookBase(new Book("Дядя Степа", "Сергей Михалков", "АСТ", 2021, 120, 26, "Твердый"));
        books.addBookBase(new Book("Маленькие женщины", "Луиза Мэй Олкотт", "Росмэн", 2021, 448, 16.70, "Твердый"));

        System.out.println("Книги заданного автора: ");
        List<Book> authorsInfo = books.authors("Стивен Кинг");
        for(Book b: authorsInfo){
            System.out.println(b);
        }
        System.out.println();

        System.out.println("Книги заданного издательства: ");
        List<Book> publishingHousesInfo = books.publishingHouses("АСТ");
        for(Book b: publishingHousesInfo){
            System.out.println(b);
        }
        System.out.println();

        System.out.println("Книги, изданные после заданного года: ");
        List<Book> yearsInfo = books.years(1988);
        for(Book b: yearsInfo){
            System.out.println(b);
        }

    }
}
