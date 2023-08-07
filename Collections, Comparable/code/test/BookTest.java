import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {

  @Test
  public void testCompareByTitle() {
    Book book1 = new Book("Title1", "Author1", 100);
    Book book2 = new Book("Title2", "Author2", 222);
    Book book3 = new Book("Title2", "Author2", 222);

    BookTitleAuthorComparator comparator = new BookTitleAuthorComparator();

    int result = comparator.compare(book1, book2);
    assertTrue(result < 0);

    result = comparator.compare(book2, book1);
    assertTrue(result > 0);

    result = comparator.compare(book2, book3);
    assertEquals(0, result);
  }

  @Test
  public void testCompareByAuthor() {
    Book book1 = new Book("Title1", "Author1", 100);
    Book book2 = new Book("Title2", "Author2", 222);
    Book book3 = new Book("Title2", "Author2", 222);

    BookTitleAuthorComparator comparator = new BookTitleAuthorComparator();

    int result = comparator.compare(book1, book2);
    assertTrue(result < 0);

    result = comparator.compare(book2, book3);
    assertEquals(0, result);
  }

  @Test
  public void testFullCompare() {
    Book book1 = new Book("Title1", "Author1", 100);
    Book book2 = new Book("Title2", "Author2", 222);
    Book book3 = new Book("Title2", "Author2", 222);

    BookTitleAuthorComparator comparator = new BookTitleAuthorComparator();

    int result = comparator.compare(book1, book2);
    assertTrue(result < 0);

    result = comparator.compare(book2, book3);
    assertEquals(0, result);

    result = comparator.compare(book3, book2);
    assertEquals(0, result);
  }
}
