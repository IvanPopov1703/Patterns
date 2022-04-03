package example.examp_factory.banking;

import example.examp_factory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking projects");
    }
}
