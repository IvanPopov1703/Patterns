package creation_patterns.abstract_factory.lapizza;

import creation_patterns.abstract_factory.*;

public class LapizzaFactory implements PizzaIngredientFactory {

    @Override
    public Dough getDough() {
        return new YeastDough();
    }

    @Override
    public Sauce getSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese getCheese() {
        return new TilsiterCheese();
    }

    @Override
    public Tomatoes getTomatoes() {
        return new SiberianShangiTomato();
    }
}
