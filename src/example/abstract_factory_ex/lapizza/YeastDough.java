package example.abstract_factory_ex.lapizza;

import example.abstract_factory_ex.Dough;

public class YeastDough implements Dough {

    @Override
    public void cookingDough() {
        System.out.println("Приготовлено дрожжевое тесто");
    }
}
