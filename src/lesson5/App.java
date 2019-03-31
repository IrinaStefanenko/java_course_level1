package lesson5;

public class App {

    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        obj.field = 10;
        obj.staticField = 20;

        StaticExample secondObj = new StaticExample();
        secondObj.field = 15;
        secondObj.staticField = 25;

        System.out.println("Static field of first obj: " + obj.staticField);

        StaticExample.staticField = 10;
        StaticExample.method();
    }

}
