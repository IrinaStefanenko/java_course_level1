package lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Ivan", 10));
        cats.add(new Cat("I", 5));
        cats.add(new Cat("Java", 7));
        cats.add(new Cat("Qwerty", 12));
        cats.add(new Cat("Vaskya", 3));
        cats.add(new Cat("R", 4));

        Collections.sort(cats);
        System.out.println(cats);

        Collections.sort(cats, new CatAgeComparator());
        System.out.println(cats);

    }


}
