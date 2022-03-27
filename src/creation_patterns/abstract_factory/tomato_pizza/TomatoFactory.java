package creation_patterns.abstract_factory.tomato_pizza;

import creation_patterns.abstract_factory.*;

public class TomatoFactory implements PizzaIngredientFactory {

    @Override
    public Dough getDough() {
        return new PuffDough();
    }

    @Override
    public Sauce getSauce() {
        return new PestoSauce();
    }

    @Override
    public Cheese getCheese() {
        return new GoudaCheese();
    }

    @Override
    public Tomatoes getTomatoes() {
        return new ChiliTomato();
    }
}
