package lesson5;

public class Cat {

    private double weight;
    private int age;
    private String name;

    private Cat(double weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    // Статический инициализатор объекта
    public static Cat createInstance(String name, int age, double weight) {
        if (StringUtil.isEmpty(name) || age < 0 || weight <= 0) {
            return null;
        }
        return new Cat(weight, age, name);
    }


}
