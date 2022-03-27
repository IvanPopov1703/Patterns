package creation_patterns.abstract_factory.tomato_pizza;

import creation_patterns.abstract_factory.Sauce;

public class PestoSauce implements Sauce {

    @Override
    public void choiceSauce() {
        System.out.println("Соус песто");
    }
}