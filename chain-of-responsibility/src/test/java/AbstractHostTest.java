import communicate.Request;
import communicate.Response;
import communicate.Status;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractHostTest {

    private Computer computer;
    private String networkIp = "200.200.200.1";
    private String routeIp = "200.200.0.1";
    private String serverIp = "10.10.0.1";
    private String computerIp = "10.10.0.3";


    @Before
    public void initNetwork(){
        Network network = new Network(networkIp);
        Host route = new Router(routeIp);
        Host server = new Server(serverIp);
        computer = new Computer(computerIp);


        computer.setNextHop(server);
        server.setNextHop(route);
        route.setNextHop(network);
    }

    @Test
    public void connectAccepted() throws Exception {
        Request request = computer.makeRequest(networkIp, "Hello World.");
        Response response = computer.connect(request);

        assertEquals(Status.ACCEPTED, response.getStatus());
    }

    @Test
    public void connectedRejected()throws Exception {
        String wrongIp = "1.1.1.1";
        Request request = computer.makeRequest(wrongIp, "Hello World.");
        Response response = computer.connect(request);

        assertEquals(Status.HOST_UNREACHABLE, response.getStatus());
    }
}