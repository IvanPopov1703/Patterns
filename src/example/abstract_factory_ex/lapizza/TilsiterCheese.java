package example.abstract_factory_ex.lapizza;

import example.abstract_factory_ex.Cheese;

public class TilsiterCheese implements Cheese {

    @Override
    public void choiceCheese() {
        System.out.println("Сыр тильзитер");
    }
}
