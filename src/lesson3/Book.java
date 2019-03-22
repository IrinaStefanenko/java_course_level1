package lesson3;

public class Book {
    double weight;
    String name;
    private double price;
    int discount;

    public Book() {
        name = "Без название";
    }

    public Book(String bookName) {
        name = bookName;
    }

    Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double calculatePrice() {
        double finalPrice = price - price * discount / 100;
        return calculate(0);
    }

    double calculatePrice(int personDiscount) {
        return calculate(personDiscount);

    }

    private double calculate(int personDiscount) {
        return price - price * discount / 100 - price * personDiscount / 100;
    }

    void print() {
        System.out.println("Name: " + name + ", price: " + price);
    }

    public double getPrice() {
        return price;
    }

    public void setupPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        }
    }

}
