package creation_patterns.ex.example;

import creation_patterns.ex.example.banking.BankingTeamFactory;

public class SuperBankSystem {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating product...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
