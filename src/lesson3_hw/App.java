package lesson3_hw;


import static jdk.nashorn.internal.objects.NativeMath.min;

public class App {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("Значение суммы " +
                calc.summ(4,4));
        System.out.println("Значение суммы " +
                calc.summ(422222L,4));
        System.out.println("Значение суммы" +
                calc.summ(4.0,4));
        System.out.println("Значение разности " +
                calc.subtraction(4,4));
        System.out.println("Значение разности " +
                calc.subtraction(4L,4));
        System.out.println("Значение разности " +
                calc.subtraction(4.0,4));
        System.out.println("Значение произведение " +
                calc.multiplication(4,4));
        System.out.println("Значение произведение " +
                calc.multiplication(4L,4));
        System.out.println("Значение произведение " +
                calc.multiplication(4.0,4));
        System.out.println("Значение деление " +
                calc.division(4,4));
        System.out.println("Значение деление " +
                calc.division(4L,4));
        System.out.println("Значение деление " +
                calc.division(4.0,4));


        Ball[] ball = new Ball[3];
        ball[0] = new Ball(6,12, "Зеленый");
        ball[1] = new Ball(1,2, "Зеленый");
        ball[2] = new Ball(3,6, "Голубой");
        Ball resultBall = new Ball();
        resultBall.printArrayBalls(ball);

        int[] array = {4, 4, 9, 5, 78};
        System.out.println("Min value in array " + ArrayUtil.min(array));
        System.out.println("Max value in array " + ArrayUtil.max(array));


    }


}
