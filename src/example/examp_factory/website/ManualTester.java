package example.examp_factory.website;

import example.examp_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tests website");
    }
}
