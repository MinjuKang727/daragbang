package part4.role;

import part4.SetMenu;
import part4.food.Burger;
import part4.food.Drink;

public class KitchenPartTimer implements CookerRole {
    // 이름 - 문자열
    private String name;
    // 급여 - 정수형
    private int salary;


    // 출근하면 출근 카드를 기록
    public void startWork() {
        System.out.println("주방 파트타이머 출근");

        // 출근을 기록하는 부모 클래스의 메소드 수행
        CookerRole.super.recordAttendance();
    }

    // 퇴근할 때 퇴근을 기록
    public void endWork() {
        System.out.println("주방 파트타이머 퇴근");

        // / 퇴근을 기록하는 부모 클래스의 메소드 수행
        CookerRole.super.recordLeaving();
    }


    @Override
    public Burger makeBurger(Burger burger) {
        System.out.println("파트타이머가 버거를 만듭니다.");
        return burger;
    }

    @Override
    public Drink extractDrink(String name, String size) {
        return Drink.of(name, size);
    }

    @Override
    public SetMenu makeSetMenu(Burger burger, Drink drink) {
        return new SetMenu(burger, drink);
    }
}
