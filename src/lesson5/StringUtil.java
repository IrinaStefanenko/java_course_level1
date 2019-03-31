package lesson5;

public class StringUtil {


    public static boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isEmpty(null));
        System.out.println(isEmpty(""));
        System.out.println(isEmpty("        "));
        System.out.println(isEmpty("Some text"));
    }

}
