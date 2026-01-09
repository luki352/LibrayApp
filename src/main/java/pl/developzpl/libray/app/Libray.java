package pl.developzpl.libray.app;

import pl.developzpl.libray.model.Book;

public class Libray {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.4";

        Book book1 = new Book("W pustyni i puszczy","Henryk Sienkiewicz", 2010,
                296, "Greg", "9788373271890");
        Book book2 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz",2023, 358,
                "PWN", "9784273271875");
        Book book3 = new Book("Bajki dla dzieci", "Jan Brzechwa", 1998, 45,
                "WAM");


        System.out.println(appName);
        System.out.println("Książki dostępne w bibiliotece:");

        book1.setPages(150);
        System.out.println("Książka pierwsza w katalogu:  "+ book1.getPages());

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();


    }
}
