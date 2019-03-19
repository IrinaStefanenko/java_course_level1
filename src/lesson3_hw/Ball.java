package lesson3_hw;

public class Ball {
    private int diameter;
    private int radius;
    private String color;

     Ball(){

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
}
