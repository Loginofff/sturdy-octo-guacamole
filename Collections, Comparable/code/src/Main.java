import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  // Создайте класс Book (книга), в конструктор которого передавайте автора,
  // название книги и количество страниц.
  // Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
  // а если авторы совпадают - по названиям (и там, и там - по алфавиту,
  // "в словарном порядке"), а если и авторы совпадают - по количеству страниц (по возрастанию).

    public static void main(String[] args) {
      List<Book> books = new ArrayList<>();
      books.add(new Book("Жизнь насекомых", "Виктор Пелевин", 333));
      books.add(new Book("Transhumanism Inc.", "Виктор Пелевин", 417));
      books.add(new Book("Человек, который смеётся", "Виктор Гюго", 299));
      books.add(new Book("Сто лет одиночества", "Габриэль Маркес", 165));

      System.out.println("До сортировки:");
      for (Book book : books) {
        System.out.println(book);
      }

      BookTitleAuthorComparator comparator = new BookTitleAuthorComparator();
      Collections.sort(books, comparator);

      System.out.println("\nПосле сортировки:");
      for (Book book : books) {
        System.out.println(book); //по автору, по названию, по страницам.
      }
    }
}