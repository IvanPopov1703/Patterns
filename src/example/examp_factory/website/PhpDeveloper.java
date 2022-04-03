package example.examp_factory.website;

import example.examp_factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php dev write php website code...");
    }
}
