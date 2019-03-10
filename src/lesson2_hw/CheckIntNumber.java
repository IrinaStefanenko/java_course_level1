package lesson2_hw;

import java.util.Scanner;

public class CheckIntNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Веедите целое число");

        if(sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number % 2 != 0) {
                System.out.println("Число " + number + " не четное");
            } else {
                System.out.println("Число " + number + " четное");
            }
        }
        else {
            System.out.println("Вы ввели не корректное число");
        }
    }
}
