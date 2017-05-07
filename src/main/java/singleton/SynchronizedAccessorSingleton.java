package singleton;

public class SynchronizedAccessorSingleton {
    private static SynchronizedAccessorSingleton instance;

    public static synchronized SynchronizedAccessorSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedAccessorSingleton();
        }
        return instance;
    }
}
