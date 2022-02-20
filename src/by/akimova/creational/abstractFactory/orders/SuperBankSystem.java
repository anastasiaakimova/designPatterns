package by.akimova.creational.abstractFactory.orders;

import by.akimova.creational.abstractFactory.ProjectTeamFactory;
import by.akimova.creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        var projectTeamFactory = new BankingTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system:");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
