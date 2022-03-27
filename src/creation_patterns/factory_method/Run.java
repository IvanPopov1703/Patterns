package creation_patterns.factory_method;

import creation_patterns.factory_method.factory.CheesePizzaFactory;
import creation_patterns.factory_method.factory.EuropeanPizzaFactory;
import creation_patterns.factory_method.factory.PepperoniPizzaFactory;
import creation_patterns.factory_method.factory.PizzaFactory;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = createPizza(selectTypePizza());
        Pizza pizza = pizzaFactory.createPizza();

        System.out.println("Процесс приготовления пиццы...");
        pizza.preparing();
        pizza.backing();
        pizza.cutting();
        pizza.packaging();
    }

    private static String selectTypePizza() {
        System.out.println("Выберите тип пиццы:");
        System.out.println("1. Сырная");
        System.out.println("2. Европейская");
        System.out.println("3. Пеперони");
        System.out.print("--> ");
        int num = new Scanner(System.in).nextInt();
        if (num == 1) return "Сырная";
        if (num == 2) return "Европейская";
        if (num == 3) return "Пеперони";
        return "";
    }

    private static PizzaFactory createPizza(String typePizza) {
        if ("Сырная".equalsIgnoreCase(typePizza)) {
            return new CheesePizzaFactory();
        } else {
            if ("Европейская".equalsIgnoreCase(typePizza)) {
                return new EuropeanPizzaFactory();
            } else {
                if ("Пеперони".equalsIgnoreCase(typePizza)) {
                    return new PepperoniPizzaFactory();
                }
            }
        }
        throw new RuntimeException("Пиццы с выбранным типом не существует!");
    }
}
