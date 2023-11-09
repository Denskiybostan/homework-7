public class book {
    String Author;
    int yearOfIssue;
    String nameOfBook;

    public book(String nameOfBook, int yearOfIssue) {
        this.nameOfBook = nameOfBook;
        this.yearOfIssue = yearOfIssue;

    }
    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public int getYearOfIssue() {
        return this.yearOfIssue;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

}
