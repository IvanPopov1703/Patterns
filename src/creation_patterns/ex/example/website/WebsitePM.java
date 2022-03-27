package creation_patterns.ex.example.website;

import creation_patterns.ex.example.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
