package lesson2_hw;

import java.util.Scanner;

public class SequenceNumbers {
    public static void main(String[] args) {
        //  Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        int number = 1000;
        System.out.println("Последоательность чисел увеличивается на 3");
        while (number < 10000) {
            System.out.print(number + " ");
            number += 3;
        }
        System.out.println();
        // Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        int num = 1;
        System.out.println("Последоательность чисел увеличивается на 2");
        for (int i = 0; i < 55; i++) {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.println();

        //Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60
        int seqNum = 90;
        System.out.println("Последовательность изменяется на 5 до отрицательных чисел");
        while (seqNum >= 0) {
            System.out.print(seqNum + " ");
            seqNum -= 5;
        }
        System.out.println();

        //Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        int sym = 2;
        System.out.println("Последоательность чисел увеличивается на 2");
        for (int i = 0; i < 20; i++) {
            System.out.print(sym + " ");
            sym = sym * 2;
        }
        System.out.println();

        //Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
        Scanner sc = new Scanner(System.in);
        System.out.println("Веедите целое положительное число");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println("Факториал числа " + n + " = " + factorial);
        } else {
            System.out.println("Вы ввели не корректное число");
        }
        System.out.println();

        // Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
        System.out.println("Последовательность фибоначи ");
        int[] arrF = new int[11];
        for (int i = 0; i < 11; i++) {
            if (i <= 1) {
                arrF[i] = 1;
            } else {
                arrF[i] = arrF[i - 1] + arrF[i - 2];
            }
            System.out.print(arrF[i] + " ");
        }
        System.out.println();

        //Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
        Scanner scan = new Scanner(System.in);
        System.out.println("Веедите целое положительное число");
        if (scan.hasNextInt()) {
            int n = scan.nextInt();

            if (n > 0) {
                System.out.println("Делители числа " + n);
                for (int i = 1; i <= n; i++) {
                    if ((n % i) == 0){
                        System.out.print( i + " ");
                    }
                }
            } else {
                System.out.println("Вы ввели не натуральное число");
            }
        } else {
            System.out.println("Вы ввели не корректное число");
        }
        System.out.println();

        //Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым.
        // Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный
        // делитель уже ясно, что число составное и проверку продолжать не нужно). Также учтите, что наименьший
        // делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [2; √n].
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веедите целое положительное число");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                boolean bool = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if ((n % i) == 0 ){
                        bool =  false;
                        System.out.print( "Число " + n + " не простое");
                        break;
                    }
                }
                if (bool) {
                    System.out.println("Число " + n + " простое");
                }
            } else {
                System.out.println("Вы ввели не натуральное число");
            }
        } else {
            System.out.println("Вы ввели не корректное число");
        }
        System.out.println();

    }
}
