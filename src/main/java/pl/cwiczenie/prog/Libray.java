package pl.cwiczenie.prog;

public class Libray {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";

        Book book1 = new Book("W pustyni i puszczy","Henryk Sienkiewicz", 2010,
                296, "Greg", "9788373271890");
        Book book2 = new Book("Ogniem i Mieczem", "Henryk Sienkiewicz",2023, 358,
                "PWN", "9784273271875");
        Book book3 = new Book("Bajki dla dzieci", "Jan Brzechwa", 1998, 45,
                "WAM", "94356373271890");


        System.out.println(appName);
        System.out.println("Książki dostępne w bibiliotece:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

//        System.out.println(book1);
//        System.out.println(book1.author);
//        System.out.println(book1.releaseDate);
//        System.out.println(book1.pages);
//        System.out.println(book1.publisher);
//        System.out.println(book1.isbn);
    }
}
