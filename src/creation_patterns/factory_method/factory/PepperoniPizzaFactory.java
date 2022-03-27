package creation_patterns.factory_method.factory;

import creation_patterns.factory_method.PepperoniPizza;
import creation_patterns.factory_method.Pizza;

public class PepperoniPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}
