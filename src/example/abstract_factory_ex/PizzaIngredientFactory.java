package example.abstract_factory_ex;

public interface PizzaIngredientFactory {
    Dough getDough();
    Sauce getSauce();
    Cheese getCheese();
    Tomatoes getTomatoes();
}
