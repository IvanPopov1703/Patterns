package creation_patterns.ex.example.website;

import creation_patterns.ex.example.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tests website");
    }
}
