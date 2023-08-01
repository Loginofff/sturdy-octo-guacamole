import java.util.Objects;

public class Book implements Comparable<Book> {

  private final String nameOfBook;
  private final String author;
  private final int quantity;

  public String getNameOfBook() {
    return nameOfBook;
  }

  public String getAuthor() {
    return author;
  }

  public int getQuantity() {
    return quantity;
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
  public int compareTo(Book o) {
    int authorComparison = this.author.compareTo(o.author);
    if (authorComparison != 0) {
      return authorComparison;
    }

    int nameComparison = this.nameOfBook.compareTo(o.nameOfBook);
    if (nameComparison != 0) {
      return nameComparison;
    }

    return Integer.compare(this.quantity, o.quantity);
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
