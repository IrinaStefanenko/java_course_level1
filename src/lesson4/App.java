package lesson4;


public class App {
    public static void main(String[] args) {
        Publication publication = new Publication(40);
        Book book = new Book("Альбинп", 10);
        publication.autor = "Робер нортон";
        book.autor = "Том сойер";
        System.out.println("Publisher " + book.publisher);
        System.out.println("Publisher " + publication.publisher);
        System.out.println("Formatter " + book.getFormatteName());
        System.out.println("Formatter name: " + publication.getFormatteName());
        ElectronicBook electronicBook = new ElectronicBook();
        System.out.println("Ebook name: " + electronicBook.getFormatteName());

    }
}
