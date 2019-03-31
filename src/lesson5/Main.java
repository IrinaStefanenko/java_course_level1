package lesson5;

public class Main {

    public static void main(String[] args) {
        Cat cat = Cat.createInstance("Vasya", 10, 6.45);
        Cat invalidCat = Cat.createInstance("", 1, 1.34);
        System.out.println(cat);
        System.out.println(invalidCat);
    }

}
