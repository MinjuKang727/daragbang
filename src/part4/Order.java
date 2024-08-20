package part4;

import part4.food.Burger;
import part4.food.Drink;

import java.util.List;

public class Order {

    List<Burger> burgers;
    List<Drink> drinks;

    Order(List<Burger> burgers, List<Drink> drinks) {
        this.burgers = burgers;
        this.drinks = drinks;
    }
}
