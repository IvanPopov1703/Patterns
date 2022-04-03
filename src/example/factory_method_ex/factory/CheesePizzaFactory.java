package example.factory_method_ex.factory;

import example.factory_method_ex.CheesePizza;
import example.factory_method_ex.Pizza;

public class CheesePizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
