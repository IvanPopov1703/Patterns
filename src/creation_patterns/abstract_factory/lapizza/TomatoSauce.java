package creation_patterns.abstract_factory.lapizza;

import creation_patterns.abstract_factory.Sauce;

public class TomatoSauce implements Sauce {

    @Override
    public void choiceSauce() {
        System.out.println("Томатный соус");
    }
}
