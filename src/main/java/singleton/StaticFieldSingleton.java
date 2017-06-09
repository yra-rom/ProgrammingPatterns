package singleton;

public final class StaticFieldSingleton {

    private static final StaticFieldSingleton instance = new StaticFieldSingleton();
    public static StaticFieldSingleton getInstance() {
        return instance;
    }

    private StaticFieldSingleton(){}
}
