import java.util.Objects;

public class book {
    private Author author;
    int yearOfIssue;
    String nameOfBook;

    public book(String nameOfBook, int yearOfIssue, Author author) {
        this.nameOfBook = nameOfBook;
        this.yearOfIssue = yearOfIssue;
        this.author = author;

    }
    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public int getYearOfIssue() {
        return this.yearOfIssue;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "book{" +
                "author=" + author +
                ", yearOfIssue=" + yearOfIssue +
                ", nameOfBook='" + nameOfBook + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        book book = (book) o;
        return yearOfIssue == book.yearOfIssue && Objects.equals(author, book.author) && Objects.equals(nameOfBook, book.nameOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, yearOfIssue, nameOfBook);
    }
}
