package by.akimova.creational.factoryMethod.factory;

import by.akimova.creational.factoryMethod.developers.Developer;
import by.akimova.creational.factoryMethod.developers.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
