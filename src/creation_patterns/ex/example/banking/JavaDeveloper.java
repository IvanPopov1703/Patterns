package creation_patterns.ex.example.banking;

import creation_patterns.ex.example.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java dev write java banking code...");
    }
}
