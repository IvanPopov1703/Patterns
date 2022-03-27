package creation_patterns.ex.example.website;

import creation_patterns.ex.example.Developer;
import creation_patterns.ex.example.ProjectManager;
import creation_patterns.ex.example.ProjectTeamFactory;
import creation_patterns.ex.example.Tester;

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
