package by.akimova.creational.abstractFactory.webSite;

import by.akimova.creational.abstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages web site project.");
    }
}
