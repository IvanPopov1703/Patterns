package example.factory_method_ex.factory;

import example.factory_method_ex.PepperoniPizza;
import example.factory_method_ex.Pizza;

public class PepperoniPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}
