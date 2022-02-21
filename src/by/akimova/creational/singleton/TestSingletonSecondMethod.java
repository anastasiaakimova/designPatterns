package by.akimova.creational.singleton;

public class TestSingletonSecondMethod {

    private static final TestSingletonSecondMethod instance = new TestSingletonSecondMethod();

    public static TestSingletonSecondMethod getInstance() {
        return instance;
    }

    private TestSingletonSecondMethod() {
    }

    public void print() {
        System.out.println(this);
    }

    public void stop() {
        System.out.println("stop");
    }
}
