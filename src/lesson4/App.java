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

        System.out.println();

        Publication[] object = new Publication[3];
        object[0] = book;
        object[1] = publication;
        object[2] = electronicBook;

        for (int i = 0 ; i < object.length; i++){
            System.out.println(object[i].getFormatteName());
        }
    }
}
