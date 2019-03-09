package lesson1;

public class Main {

    public static void main (String[] arg) {
        math();
        equation();
    }

    private static void math(){
        int a = 2;
        int b = 5;
        int sum = a + b;
        System.out.println("Result a+b = " + sum);
        int minus = a + b;
        System.out.println("Result a-b = " + minus);
        int multiplication = a * b;
        System.out.println("Result a*b = " + multiplication);
        int division = a / b;
        System.out.println("Result a/b = " + division);
        int divisionNod = a % b;
        int divisionInt = a / b;
        System.out.println("Result: " + divisionInt + " and remainder of the division " + divisionNod);
        double d = 5.0;
        double divisionDouble = a / d;
        System.out.println("Result a/d = " + divisionDouble);
    }

    private static void equation(){
        double a = 3.0;
        double b = 45;
        double x = (- b) / a;

        System.out.println("Result equation 'ax + b = 0',  where x = " + x +
                ". Check is " + (a * x + b) + " should be equаls 0." );


    }
}
