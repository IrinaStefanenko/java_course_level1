package lesson2_hw;

import java.util.Random;

public class MaxNumber {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        int a = (int) randomNumber / 100;
        int b =  ((int) randomNumber / 10) % 10;
        int c =  randomNumber % 10;

        if (a >= b && a >= c) {
            System.out.println("В числе " + randomNumber + " наибольшая цифра " + a + ". ");
        } else if(b >= a && b >= c){
            System.out.println("В числе " + randomNumber + " наибольшая цифра " + b + ". ");
        }
        else {
            System.out.println("В числе " + randomNumber + " наибольшая цифра " + c + ". ");
        }
    }
}
