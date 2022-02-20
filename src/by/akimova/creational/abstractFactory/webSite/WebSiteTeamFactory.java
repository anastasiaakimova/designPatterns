package by.akimova.creational.abstractFactory.webSite;

import by.akimova.creational.abstractFactory.Developer;
import by.akimova.creational.abstractFactory.ProjectManager;
import by.akimova.creational.abstractFactory.ProjectTeamFactory;
import by.akimova.creational.abstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
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
        return new WebSitePM();
    }
}
