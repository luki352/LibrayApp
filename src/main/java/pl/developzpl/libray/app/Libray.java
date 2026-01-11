package pl.developzpl.libray.app;

import pl.developzpl.libray.model.Book;

public class Libray {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

        Book [] books  = new Book[1000];
        books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296,
                "Greg", "9788373271890");

        books[1] = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz",2023, 358,
                "PWN", "9784273271875");
        books[2] = new Book("Bajki dla dzieci", "Jan Brzechwa", 1998, 45,
                "WAM");


        System.out.println(appName);
        System.out.println("Książki dostępne w bibiliotece:");


        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        System.out.println("System może przechowywać do "+ books.length +" książek");


    }
}
