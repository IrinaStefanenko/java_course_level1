package lesson5.person;


public interface Shiftable {

    public static final int START_WORK = 10;
    int END_WORK = 18;

    boolean isAtWork(int hour);

}
