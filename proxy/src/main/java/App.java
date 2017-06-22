public class App {
    public static void main(String[] args) {
        User user = new User("1", "Cola", "Pola");
        UserLazyCloneProxy userLazyOriginalProxy = new UserLazyCloneProxy(user);

        UserLazyCloneProxy userLazyClone = (UserLazyCloneProxy) userLazyOriginalProxy.clone();
    }
}
