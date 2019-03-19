package lesson3_hw;

public class ArrayUtil {

   public static int  min(int[] array){
       int min = array[0];
        for (int i = 1; i < array.length; i++){
          if (min > array[i]){
              min = array[i];
          }
        }
       return min;
   }

   public static int max(int[] array){
       int max = array[0];
       for (int i = 1; i < array.length; i++){
           if (max < array[i]){
               max = array[i];
           }
       }
       return max;

   }
}
