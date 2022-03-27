package creation_patterns.factory_method.factory;

import creation_patterns.factory_method.CheesePizza;
import creation_patterns.factory_method.Pizza;

public class CheesePizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
