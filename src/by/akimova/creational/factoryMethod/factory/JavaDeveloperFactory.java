package by.akimova.creational.factoryMethod.factory;

import by.akimova.creational.factoryMethod.developers.Developer;
import by.akimova.creational.factoryMethod.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
