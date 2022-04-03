package example.abstract_factory_ex.tomato_pizza;

import example.abstract_factory_ex.Sauce;

public class PestoSauce implements Sauce {

    @Override
    public void choiceSauce() {
        System.out.println("Соус песто");
    }
}