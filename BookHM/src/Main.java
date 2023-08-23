import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Title 3", "Author C", 200));
    books.add(new Book("Title 1", "Author A", 150));
    books.add(new Book("Title 2", "Author B", 180));
    books.add(new Book("Title 4", "Author A", 220));

    Comparator<Book> titleAuthorComparator = new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        int authorComparison = o1.getAuthor().compareTo(o2.getAuthor());
        if (authorComparison != 0) {
          return authorComparison;
        }
        return o1.getNameOfBook().compareTo(o2.getNameOfBook());
      }
    };

    Collections.sort(books, titleAuthorComparator);

    for (Book book : books) {
      System.out.println(book);
    }
  }
}