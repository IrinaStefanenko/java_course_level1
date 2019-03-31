package lesson5;

public class StringParameterExample {

    public static void main(String[] args) {
        String s = "s1";
        changeString(s); // <- invoke
        System.out.println(s);

        String s2 = "q" + "4" + "2" + "3";
    }

    private static void changeString(String s) {
        s = s + "s2";
    }

}
