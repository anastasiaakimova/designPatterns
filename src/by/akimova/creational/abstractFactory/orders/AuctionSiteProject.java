package by.akimova.creational.abstractFactory.orders;

import by.akimova.creational.abstractFactory.webSite.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        var projectTeamFactory = new WebSiteTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website:");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
