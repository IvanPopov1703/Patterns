package creation_patterns.abstract_factory.tomato_pizza;

import creation_patterns.abstract_factory.Cheese;

public class GoudaCheese implements Cheese {

    @Override
    public void choiceCheese() {
        System.out.println("Сыр гауда");
    }
}
