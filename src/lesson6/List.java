package lesson6;

//One way list
public class List implements Structure {
    private int size;
    private Element head;

    @Override
    public void add(int value) {
        // 1. проверим head == 0
        // 2.1 если head  == 0 то записываем  в head
        // 2.2 если head  != 0 то записываем  в botv последний элемент

        //Как ищем
        ///
        Element el =  new Element(value);
        if(head == null){
            head= el;
        }else {
            Element current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(el);
        }
        size++;

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int suze() {
        return 0;
    }
}
