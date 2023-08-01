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

    public Book(String nameOfBook, String author, int pagesNum) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.quantity = pagesNum;


    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + nameOfBook + '\'' +
                ", author='" + author + '\'' +
                ", pagesNum=" + quantity +
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
}
