package creation_patterns.abstract_factory;

import creation_patterns.abstract_factory.lapizza.LapizzaFactory;
import creation_patterns.abstract_factory.tomato_pizza.TomatoFactory;

public class RunAbstractFactory {

    public static void main(String[] args) {
        PizzaIngredientFactory pizzaFactory = new TomatoFactory();
        Dough dough = pizzaFactory.getDough();
        Sauce sauce = pizzaFactory.getSauce();
        Cheese cheese = pizzaFactory.getCheese();
        Tomatoes tomatoes = pizzaFactory.getTomatoes();

        System.out.println("Приготовление пиццы...");
        dough.cookingDough();
        sauce.choiceSauce();
        cheese.choiceCheese();
        tomatoes.choiceTomato();
    }
}
