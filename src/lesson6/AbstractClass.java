package lesson6;

public abstract class AbstractClass implements Structure{
    protected int size;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

}
