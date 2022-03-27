package creation_patterns.ex.example.website;

import creation_patterns.ex.example.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php dev write php website code...");
    }
}
