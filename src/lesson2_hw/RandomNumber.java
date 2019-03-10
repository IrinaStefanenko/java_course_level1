package lesson2_hw;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int min = 5;
        int max = 155;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        if (randomNumber >= 25 && randomNumber <= 100) {
            System.out.println("Число " + randomNumber + " содержится в интервале (25,100). ");
        } else {
            System.out.println("Число " + randomNumber + " не содержится в интервале (25,100).");
        }
    }


}
