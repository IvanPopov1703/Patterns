package example.examp_factory.website;

import example.examp_factory.Developer;
import example.examp_factory.ProjectManager;
import example.examp_factory.ProjectTeamFactory;
import example.examp_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
