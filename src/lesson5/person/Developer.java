package lesson5.person;

public class Developer extends Profession {

    public Developer() {
        super("Software Developer");
    }

    @Override
    public void job() {
        System.out.println("Drink beer");
        System.out.println("Drink coffee");
        System.out.println("Write code");
    }
}
