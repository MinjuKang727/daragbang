package part4;

import part4.food.Burger;
import part4.food.Drink;

public class SetMenu {
    private Burger burger;
    private Drink drink;

    // 버거와 음료를 하나씩 갖는 생성자
    public SetMenu(Burger burger, Drink drink) {
        this.burger = burger;
        this.drink = drink;
    }
}
