package creation_patterns.factory_method.factory;

import creation_patterns.factory_method.EuropeanPizza;
import creation_patterns.factory_method.Pizza;

public class EuropeanPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new EuropeanPizza();
    }
}
