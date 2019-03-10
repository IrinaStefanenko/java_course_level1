package lesson2_hw;

import java.util.Arrays;
import java.util.Random;

public class OrderNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            int number = 0;
            boolean bool = true;

            while (bool) {
                number = random.nextInt();
                bool = checkNumber(arr, number);
            }
            arr[i] = number;
        }
        System.out.println("Числа в переменных a, b и c: " + arr[0] + " , " + arr[1] + " , " + arr[2]);
        Arrays.sort(arr);

        System.out.println("Возрастающая последовательность: ");
        for (int number : arr) {
            System.out.println(number + " ");
        }
    }

    /**
     * Проверка что нет повторяющегося значния в масиве,  кроме нуля
     *
     * @param arr
     * @param number
     * @return
     */
    private static boolean checkNumber(int[] arr, int number) {
        boolean checkResault = false;
        for (int n : arr) {
            if (number != 0 && number == n) {
                checkResault = true;
                break;
            } else if (number == 0) {
                checkResault = false;
                break;
            }
        }
        return checkResault;
    }

}
