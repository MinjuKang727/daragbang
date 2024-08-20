package part4_practice.inheritance;

public class Car {

    String company;
    char gear = 'P';

    Tire[] tires;

    public char changeGear(char type) {
        gear = type;
        return gear;
    }
}
