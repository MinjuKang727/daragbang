package part4.food;

public class Drink {
    String name;
    String size;
    Integer price;

    public Drink() {

    }

    public Drink(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public static Drink of (String name, String size) {
        return new Drink(name, size);
    }
}
