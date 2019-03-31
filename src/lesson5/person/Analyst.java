package lesson5.person;

public class Analyst extends Profession implements Shiftable, Comparable {

    public Analyst() {
        super("Analyst");
    }

    @Override
    public void job() {
            System.out.println("Write TT");
            System.out.println("Drink tea");
            System.out.println("Create diagram");
    }

    @Override
    public boolean isAtWork(int hour) {
        return hour >= START_WORK && hour <= END_WORK;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
