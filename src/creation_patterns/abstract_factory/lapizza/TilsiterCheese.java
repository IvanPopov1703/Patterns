package creation_patterns.abstract_factory.lapizza;

import creation_patterns.abstract_factory.Cheese;

public class TilsiterCheese implements Cheese {

    @Override
    public void choiceCheese() {
        System.out.println("Сыр тильзитер");
    }
}
