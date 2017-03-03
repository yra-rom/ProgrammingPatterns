package singleton;

public class HolderSingleton {
    private static class Holder{
        static final HolderSingleton HOLDER_SINGLETON = new HolderSingleton();
    }

    public static HolderSingleton getInstance(){
        return Holder.HOLDER_SINGLETON;
    }
}
