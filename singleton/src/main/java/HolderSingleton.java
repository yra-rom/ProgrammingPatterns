public final class HolderSingleton {
    private final static class Holder{
        static final HolderSingleton HOLDER_SINGLETON = new HolderSingleton();
    }

    public static HolderSingleton getInstance(){
        return Holder.HOLDER_SINGLETON;
    }
}
