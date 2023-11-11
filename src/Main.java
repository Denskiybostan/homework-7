import java.util.Set;

public class Main {
    public static void main(String[] args) {
    String nameOfBook = "Rusalka";
    int yearOfIssue = 1837;
    String nameOfBook2 = "Voyna i Mir";
    int yearOfIssue2 = 1867;
    String [] namesOfBooks = {"Rusalka", "Voyna i Mir"};
    int [] yearsOfIssue = {1837, 1867};

    String nameAuthor =  "Alexandr";
    String surNameAuthor = "Pushkin";
    String nameAuthor2 = "Lev";
    String surnameAuthor2 = "Tolstoy";
    String [] namesAuthors = {"Alexandr", "Lev"};
    String [] surnamesAuthors = {"Pushkin", "Tolstoy"};



        Author AlexandrPushkin = new Author("Alexandr", "Pushkin");
        book rusalka = new book("Rusalka", 1837, AlexandrPushkin);
        System.out.println("Название книги  = " + rusalka.getNameOfBook() + " год издания " + rusalka.getYearOfIssue());
        System.out.println("Имя автора = " + AlexandrPushkin.getName() + " фамилия автора " + AlexandrPushkin.getSurname());
        rusalka.setYearOfIssue(1838);
        System.out.println("год издания " + rusalka.getYearOfIssue());
        Author LevTolstoy = new Author("Lev", "Tolstoy");
        book voynaIMir = new book ("Voyna i mir", 1867, LevTolstoy);
        System.out.println("Название книги = " + voynaIMir.getNameOfBook() + " год выпуска " + voynaIMir.getYearOfIssue());
        System.out.println("Имя автора = " + LevTolstoy.getName() + " фамилия автора " + LevTolstoy.getSurname());

}
}