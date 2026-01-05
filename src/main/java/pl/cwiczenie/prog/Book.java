package pl.cwiczenie.prog;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;
    Book(String title,String author, int releaseDate,
         int pages, String  publisher, String isbn){
        this(title, author, releaseDate, pages, publisher);
        this.isbn = isbn;
    }
    Book(String title,String author, int releaseDate,
         int pages, String  publisher){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
    }
    void printInfo(){
        String info = "Tytuł: "+ title + "\n"+" Autor: " + author + "\n Rok wydania: " + releaseDate+
                "\n Ilość stron: "+ pages + "\n wydawnictwo: "+ publisher + "\n Numer ISBN: "+ isbn;
        System.out.println(info);
    }
}
