package creation_patterns.abstract_factory.lapizza;

import creation_patterns.abstract_factory.Tomatoes;

public class SiberianShangiTomato  implements Tomatoes {

    @Override
    public void choiceTomato() {
        System.out.println("Помидор сорта сибирский шаньги");
    }
}
