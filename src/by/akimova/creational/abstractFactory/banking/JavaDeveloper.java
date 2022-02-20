package by.akimova.creational.abstractFactory.banking;

import by.akimova.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code.");
    }
}
