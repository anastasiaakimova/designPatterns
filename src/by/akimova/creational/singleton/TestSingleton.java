package by.akimova.creational.singleton;

public class TestSingleton {
    private static TestSingleton instance;

    /**
     * Synchronized используется при многопоточности, когда к объекту
     * может обращаться несколько потоков одновременно.
     * Потоки будут получать один и тот же экземпляр, потому что каждый поток будет ждать предыдущий поток,
     * который занял этот метод.
     *
     * @return instance
     */
    public static synchronized TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }

        return instance;
    }


    private TestSingleton() {
    }

    public void print() {
        System.out.println(this);
    }

    public void stop() {
        System.out.println("stop");
    }
}
