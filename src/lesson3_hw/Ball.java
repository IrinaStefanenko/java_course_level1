package lesson3_hw;

import java.util.Objects;

public class Ball {
    private int diameter;
    private int radius;
    private String color;

     public Ball(){

    }

    public Ball(int diametr, int radius,  String color){
        this.diameter = diametr;
        this.radius = radius;
        this.color = color;
    }


    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public  void printArrayBalls(Ball[] ball ){
        System.out.println( "Balls");
        for ( int i = 0; i < ball.length; i++) {
            printBall(ball[i]);
            System.out.println();
        }
    }

    public  void printBall(Ball ball ){
            System.out.print("Диаметр " + ball.getDiameter() +
                    " Радиус " + ball.getRadius() +
                    " Цвет " + ball.getColor());
    }

    @Override
    public  boolean equals(Object object){
        if (this == object) return true;
        if(!(object instanceof Ball)) return  false;
        Ball other = (Ball) object;
        return  diameter == other.diameter && radius == other.radius && Objects.equals(color, other.color);
    }
    @Override
    public  int hashCode(){
        int result =17;
        result += result *31 + diameter;
        result += result *31 + radius;
        result += result * 31 + color.hashCode();

        return  result;
    }

   public boolean contains(Ball[] balls, Ball ball){
       for ( int i = 0; i < balls.length; i++) {
          if ( balls[i].hashCode() == ball.hashCode() && balls[i].equals(ball)){
               return true;
           }
       }
       return false;
    }
}
