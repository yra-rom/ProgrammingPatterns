public class App {
    public static void main(String[] args) {
        User user = new User.UserBuilder().name("Name").surname("Surname").age(15).build();

        System.out.println(user);
    }
}
