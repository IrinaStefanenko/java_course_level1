package lesson5;

public class StaticTask {

    private static void print() {
        System.out.println("Print");
    }

    public static void main(String[] args) {
        StaticTask task = null;
        task.print();
    }

}
