package example.abstract_factory_ex.lapizza;

import example.abstract_factory_ex.Tomatoes;

public class SiberianShangiTomato  implements Tomatoes {

    @Override
    public void choiceTomato() {
        System.out.println("Помидор сорта сибирский шаньги");
    }
}
