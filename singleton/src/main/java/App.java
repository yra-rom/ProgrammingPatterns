public class App {
    public static void main(String[] args) {
        doubleLocking();
        enumSingleton();
        holder();
        staticField();
        synchronizedSingleton();
    }

    private static void doubleLocking() {
        DoubleLockingSingleton singleton = DoubleLockingSingleton.getInstance();
    }

    private static void enumSingleton() {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
    }

    private static void holder() {
        HolderSingleton singleton = HolderSingleton.getInstance();
    }

    private static void staticField() {
        StaticFieldSingleton singleton = StaticFieldSingleton.getInstance();
    }

    private static void synchronizedSingleton() {
        SynchronizedAccessorSingleton singleton = SynchronizedAccessorSingleton.getInstance();
    }




}
