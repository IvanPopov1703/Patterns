package example.abstract_factory_ex.lapizza;

import example.abstract_factory_ex.Sauce;

public class TomatoSauce implements Sauce {

    @Override
    public void choiceSauce() {
        System.out.println("Томатный соус");
    }
}
