package example.abstract_factory_ex.tomato_pizza;

import example.abstract_factory_ex.*;

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
