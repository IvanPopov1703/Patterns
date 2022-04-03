package example.abstract_factory_ex.tomato_pizza;

import example.abstract_factory_ex.Tomatoes;

public class ChiliTomato implements Tomatoes {

    @Override
    public void choiceTomato() {
        System.out.println("Помидор сорта чили");
    }
}
