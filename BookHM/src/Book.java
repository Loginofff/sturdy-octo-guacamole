import java.util.Objects;

public class Book {

  private final String nameOfBook;
  private final String author;
  private final int quantity;

  public String getNameOfBook() {
    return nameOfBook;
  }

  public String getAuthor() {
    return author;
  }

  public Book(String nameOfBook, String author, int quantity) {
    this.nameOfBook = nameOfBook;
    this.author = author;
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + nameOfBook + '\'' +
        ", author='" + author + '\'' +
        ", quantity=" + quantity +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Book other)) {
      return false;
    }
    return quantity == other.quantity &&
        author.equals(other.author) &&
        nameOfBook.equals(other.nameOfBook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameOfBook, author, quantity);
  }
}
