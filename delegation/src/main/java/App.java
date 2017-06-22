public class App {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Manager manger = new Manager();
        boss.hireManager(manger);

        System.out.println(boss.doWork());
    }
}
