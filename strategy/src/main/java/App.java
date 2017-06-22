public class App {
    public static void main(String[] args) {
        UserSet users = new UserSet();
        users.add(new User.UserBuilder().name("Name").age(18).build());

        users.setSummarizer(new AgeSummarizer());
        String sumAge = users.summarize();
        System.out.println(sumAge);
        users.setSummarizer(new NameSummarizer());

        String sumName = users.summarize();
        System.out.println(sumName);
    }
}
