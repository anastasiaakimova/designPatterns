package by.akimova.creational.factoryMethod;

import by.akimova.creational.factoryMethod.factory.CppDeveloperFactory;
import by.akimova.creational.factoryMethod.factory.DeveloperFactory;
import by.akimova.creational.factoryMethod.factory.JavaDeveloperFactory;
import by.akimova.creational.factoryMethod.factory.PhpDeveloperFactory;

public class Main {

    public static void main(String[] args) {
        var developerFactory = createDeveloperBySpecialty("php");
        var developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown");
        }
    }

}
