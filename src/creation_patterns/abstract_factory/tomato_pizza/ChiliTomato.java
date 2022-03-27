package creation_patterns.abstract_factory.tomato_pizza;

import creation_patterns.abstract_factory.Tomatoes;

public class ChiliTomato implements Tomatoes {

    @Override
    public void choiceTomato() {
        System.out.println("Помидор сорта чили");
    }
}
