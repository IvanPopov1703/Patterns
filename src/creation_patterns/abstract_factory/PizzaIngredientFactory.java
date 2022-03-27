package creation_patterns.abstract_factory;

public interface PizzaIngredientFactory {
    Dough getDough();
    Sauce getSauce();
    Cheese getCheese();
    Tomatoes getTomatoes();
}
