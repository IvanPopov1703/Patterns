package creation_patterns.abstract_factory.lapizza;

import creation_patterns.abstract_factory.Dough;

public class YeastDough implements Dough {

    @Override
    public void cookingDough() {
        System.out.println("Приготовлено дрожжевое тесто");
    }
}
