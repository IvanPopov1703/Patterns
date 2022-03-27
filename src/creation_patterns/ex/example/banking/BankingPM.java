package creation_patterns.ex.example.banking;

import creation_patterns.ex.example.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking projects");
    }
}
