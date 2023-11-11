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

}
