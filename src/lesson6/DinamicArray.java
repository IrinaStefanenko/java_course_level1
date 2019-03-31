package lesson6;

public class DinamicArray extends AbstractClass  {
    private int[] array;

    public DinamicArray(int initialCapacity){
        if(initialCapacity <= 0){
            initialCapacity = 10;
        }
        this.array = new int[initialCapacity];
    }

    @Override
    public void add(int value) {
        //1. Проверяем есть ли место  куда вставить
        //Увеличиваем size
        if(array.length == size){
            int[] oldArray  = array;
            array =  new int [(int) (oldArray.length * 1.5)];
            System.arraycopy(oldArray, 0,  array, 0, size);
        }
        array[size++] = value;
    }


}
