package creation_patterns.abstract_factory.tomato_pizza;

import creation_patterns.abstract_factory.Dough;

public class PuffDough implements Dough {

    @Override
    public void cookingDough() {
        System.out.println("Приготовлено слоёное тесто");
    }
}
