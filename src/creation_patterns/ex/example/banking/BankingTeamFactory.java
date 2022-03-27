package creation_patterns.ex.example.banking;

import creation_patterns.ex.example.Developer;
import creation_patterns.ex.example.ProjectManager;
import creation_patterns.ex.example.ProjectTeamFactory;
import creation_patterns.ex.example.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {


    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
