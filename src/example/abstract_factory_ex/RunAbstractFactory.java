package example.abstract_factory_ex;

import example.abstract_factory_ex.tomato_pizza.TomatoFactory;

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
