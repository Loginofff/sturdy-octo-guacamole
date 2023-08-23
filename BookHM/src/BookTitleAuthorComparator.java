

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {

  // Используйте класс `Book` (книга) из предыдущего домашнего задания.
  //
  // Создайте компаратор, который позволит сортировать книги по названию,
  // при одинаковых названиях - по автору.


  @Override
  public int compare(Book o1, Book o2) {
    int titleComparison = o1.getNameOfBook().compareTo(o2.getNameOfBook());

    if (titleComparison != 0) {
      return titleComparison;
    }

    return o1.getAuthor().compareTo(o2.getAuthor());
  }

}




