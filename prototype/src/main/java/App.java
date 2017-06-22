public class App {
    public static void main(String[] args) {
        User userOriginal = new User();
        User userClone = (User) userOriginal.copy();
    }
}
