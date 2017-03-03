package singleton;

public class StaticFieldSingleton {
    public static final StaticFieldSingleton INSTANCE = new StaticFieldSingleton();


    private static final StaticFieldSingleton instance = new StaticFieldSingleton();
    public static StaticFieldSingleton getInstance() {
        return instance;
    }

    private StaticFieldSingleton(){}
}
