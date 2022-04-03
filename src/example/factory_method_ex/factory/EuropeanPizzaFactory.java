package example.factory_method_ex.factory;

import example.factory_method_ex.EuropeanPizza;
import example.factory_method_ex.Pizza;

public class EuropeanPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new EuropeanPizza();
    }
}
