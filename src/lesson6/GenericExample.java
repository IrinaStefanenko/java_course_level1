package lesson6;

public class GenericExample {

    public static void main(String[] args) {
        GenericClass <String> stringGenericClass = new GenericClass<>();
        stringGenericClass.getValue();

        GenericClass<Integer> integerGenericClass = new GenericClass<>();
        integerGenericClass.setValue(5);

        GenericClass<Object> objectGenericClass = new GenericClass<>();
        objectGenericClass.setValue(1);
        objectGenericClass.setValue("");
        objectGenericClass.setValue(new Object());

        // raw type
        GenericClass genericClass = new GenericClass();
        genericClass.setValue(1);
    }
}
