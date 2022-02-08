package by.akimova.creational.factoryMethod.factory;


import by.akimova.creational.factoryMethod.developers.CppDeveloper;
import by.akimova.creational.factoryMethod.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
