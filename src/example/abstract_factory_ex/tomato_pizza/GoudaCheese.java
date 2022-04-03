package example.abstract_factory_ex.tomato_pizza;

import example.abstract_factory_ex.Cheese;

public class GoudaCheese implements Cheese {

    @Override
    public void choiceCheese() {
        System.out.println("Сыр гауда");
    }
}
