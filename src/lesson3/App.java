package lesson3;

public class App {
    public static void main(String[] args) {
        Book firstBook = new Book("Photoshop 7");
        firstBook.weight = 5.45d;
        System.out.println("Name of first: " + firstBook.name);
        System.out.println("Weight: " + firstBook.weight);
        double firstBookFinalPrice = firstBook.calculatePrice();
        System.out.println("Final price of first: " + firstBookFinalPrice);

        Book secondBook = new Book();
        secondBook.name = "Flash MX 2004";
        secondBook.setupPrice(596.4d);
        secondBook.discount = 31;
        System.out.println("Name of second: " + secondBook.name);
        System.out.println("Weight of second: " + secondBook.weight);
        System.out.println("Final price of second: " + secondBook.calculatePrice(10));
        Book thirdBook = new Book("Бла-бла-бла", 586);
        Book forthBook = new Book("Бла-бла-бла 2", 986);
        thirdBook.print();

    }
}
