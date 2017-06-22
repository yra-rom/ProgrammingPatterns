public final class DoubleLockingSingleton {
    private static volatile DoubleLockingSingleton instance;

    public static DoubleLockingSingleton getInstance(){
        DoubleLockingSingleton localInstance = instance;
        if(localInstance == null){
            synchronized (DoubleLockingSingleton.class){
                localInstance = instance;
                if(localInstance == null){
                    instance = localInstance = new DoubleLockingSingleton();
                }
            }
        }
        return localInstance;
    }
}
