public class App {
    public static void main(String[] args) {
        ServerFacade facade = new CatDogServerFacade(new CatDogServer());
        facade.startServer();
        facade.stopServer();
    }
}
