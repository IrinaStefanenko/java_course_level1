package lesson4_hw;

import lesson3_hw.Ball;

public class App {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.setDiameter(4);
        ball.setRadius(6);
        ball.setColor("Голубой");

        Ball[] balls = new Ball[8];
        balls[0] = new Ball(6,12, "Зеленый");
        balls[1] = new Ball(1,2, "Зеленый");
        balls[2] = new Ball(3,6, "Голубой");
        balls[3] = new Ball(4,6, "Голубой");
        balls[4] = new Ball(56,0, "Розовый");
        balls[5] = new Ball(6,6, "Радужный");
        balls[6] = new Ball(3,5, "Голубой");
        balls[7] = new Ball(1,56, "Красный");

        if (ball.contains(balls, ball)){
            System.out.println("Массив содержит обьект!");
            ball.printArrayBalls(balls);
            System.out.println( "Cодержит ball:" );
            ball.printBall(ball);
        }
        else {
            System.out.println("Массив не содержит обьект!");
            ball.printArrayBalls(balls);
            System.out.println( "Не содержит ball:" );
            ball.printBall(ball);
        }
    }
}
