package lesson2;


import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int number = sc.nextInt();

       Random rn = new Random();
        int secretNumber = rn.nextInt(7) + 3;
        System.out.println("Random number " + secretNumber);

        for(int i = 0; i < 3; i++) {
            while(!sc.hasNextInt()){
                System.out.println("enter number: ");
                sc.next();
            }

            int number = sc.nextInt();
            if (number == secretNumber) {
                System.out.println("You  are right!");
                break;
            } else if (number > secretNumber) {

                System.out.println("Enter number more than random number");
            } else {
                System.out.println("Enter number less than random number");
            }
        }
    }
}
