package lesson2_hw;

import java.util.Scanner;

import static java.lang.Math.abs;

public class TwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Веедите первое число");
        double n = sc.nextDouble();
        System.out.println("Веедите второе число");
        double m = sc.nextDouble();

        int controlNumber = 10;

        if(abs(n - controlNumber) < abs(m - controlNumber)){
            System.out.println("Число " + n + " ближе к 10");
        }
        else {
            System.out.println("Число " + m + " ближе к 10");
        }
    }
}
