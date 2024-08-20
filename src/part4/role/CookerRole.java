package part4.role;

import part4.SetMenu;
import part4.food.Burger;
import part4.food.Drink;

public interface CookerRole extends StaffRole {
    // 버거를 만든다.
    Burger makeBurger(Burger burger);
    // 음료를 뽑는다.
    Drink extractDrink(String name, String size);
    // 세트를 만든다.
    SetMenu makeSetMenu(Burger burger, Drink drink);
}
