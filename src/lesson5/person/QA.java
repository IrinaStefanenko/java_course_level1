package lesson5.person;

public class QA extends Profession {

    public QA() {
        super("Quality Assurance");
    }

    @Override
    public void job() {
        System.out.println("Test");
        System.out.println("Execute test");
        System.out.println("Report bugs");
    }
}
