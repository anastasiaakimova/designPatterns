package by.akimova.creational.abstractFactory.banking;

import by.akimova.creational.abstractFactory.Developer;
import by.akimova.creational.abstractFactory.ProjectManager;
import by.akimova.creational.abstractFactory.ProjectTeamFactory;
import by.akimova.creational.abstractFactory.Tester;

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
