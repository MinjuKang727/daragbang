package part4_practice.inheritance;

import java.util.ArrayList;
import java.util.List;

public class SportsCar extends Car {
    String engine;

    public void booster() {
        System.out.println("엔진" + engine + " 부앙~\n");
    }

    // 부모 메서드에 final 키워드가 있으면 오버라이딩 불가!
//    public char changeGear(char type) {
//        return 'D';
//    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new SportsCar();
        Car car3 = new Bus();

    }
}
