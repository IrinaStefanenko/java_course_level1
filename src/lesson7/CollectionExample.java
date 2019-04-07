package lesson7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("String");
        list.add("S1");
        list.add("pull");

        System.out.println(list.toString());
        System.out.println("Index of pull "+ list.indexOf("pull"));
        System.out.println("Index of s2 "+ list.indexOf("s2"));

        List<String>  sublist = list.subList(1, 2);
        System.out.println("Sublist " + sublist.toString());
    }
}
