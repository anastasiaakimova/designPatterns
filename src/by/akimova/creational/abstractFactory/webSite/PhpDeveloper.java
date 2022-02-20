package by.akimova.creational.abstractFactory.webSite;

import by.akimova.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code.");
    }
}
