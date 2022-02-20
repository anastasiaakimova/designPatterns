package by.akimova.creational.abstractFactory.banking;

import by.akimova.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project.");
    }
}
