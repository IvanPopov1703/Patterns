package example.examp_factory.banking;

import example.examp_factory.Developer;
import example.examp_factory.ProjectManager;
import example.examp_factory.ProjectTeamFactory;
import example.examp_factory.Tester;

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
