package example.examp_factory.banking;

import example.examp_factory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java dev write java banking code...");
    }
}
