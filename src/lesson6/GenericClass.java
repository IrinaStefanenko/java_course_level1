package lesson6;

public class GenericClass<TYPE> {
   TYPE value;

    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }
}
