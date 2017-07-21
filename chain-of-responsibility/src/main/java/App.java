import communicate.Request;
import communicate.Response;

public class App {
    public static void main(String[] args) {
        Host network = new Network("143.77.3.2");
        Host router = new Router("143.77.5.5");
        Host server = new Server("192.168.0.1");
        Computer computer = new Computer("192.168.0.4");

        router.setNextHop(network);
        server.setNextHop(router);
        computer.setNextHop(server);

        Request request = computer.makeRequest("143.77.3.2", "Hello World.");

        Response response = computer.connect(request);
        System.out.println(response.getStatus());
        System.out.println(response.getMessage());
    }
}
