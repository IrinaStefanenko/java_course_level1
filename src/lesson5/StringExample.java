package lesson5;

public class StringExample {

    public static void main(String[] args) {
        String s1 = "qwerty";
        String s2 = "qwerty";
        String s3 = new String("qwerty");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }

}
