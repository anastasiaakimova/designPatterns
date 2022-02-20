package by.akimova.creational.abstractFactory.webSite;

import by.akimova.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website.");
    }
}
