package pl.cwiczenie.prog;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;
    Book(String bookTitle,String bookauthor, int bookReleaseDate,
         int bookPages, String  bookPublisher, String bookIsbn){
        title = bookTitle;
        author = bookauthor;
        releaseDate = bookReleaseDate;
        pages = bookPages;
        publisher = bookPublisher;
        isbn = bookIsbn;
    }
    void printInfo(){
        String info = "Tytuł: "+ title + "\n"+" Autor: " + author + "\n Rok wydania: " + releaseDate+
                "\n Ilość stron: "+ pages + "\n wydawnictwo: "+ publisher + "\n Numer ISBN: "+ isbn;
        System.out.println(info);
    }
}
