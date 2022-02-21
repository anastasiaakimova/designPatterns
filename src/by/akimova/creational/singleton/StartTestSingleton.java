package by.akimova.creational.singleton;

public class StartTestSingleton {

    public static void main(String[] args) {
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().stop();

        TestSingletonSecondMethod.getInstance().print();
        TestSingletonSecondMethod.getInstance().print();
        TestSingletonSecondMethod.getInstance().print();
        TestSingletonSecondMethod.getInstance().stop();
    }
}
