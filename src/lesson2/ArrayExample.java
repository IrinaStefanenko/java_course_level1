package lesson2;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[9];
        array[0] = 2;
        array[2] = 26;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();

        int[][] arr = new int[9][9];
        arr[3][5] = 5;
        for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
          }
            System.out.println();
        }
    }
}
