package example.abstract_factory_ex.tomato_pizza;

import example.abstract_factory_ex.Dough;

public class PuffDough implements Dough {

    @Override
    public void cookingDough() {
        System.out.println("Приготовлено слоёное тесто");
    }
}
