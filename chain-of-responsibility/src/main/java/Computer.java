import communicate.Request;

public class Computer extends AbstractHost {
    public Computer(String ip) {
        super(ip);
    }

    public Request makeRequest(String to, String message) {
        Request request = new Request();
        request.setFromIp(this.ip);
        request.setToIp(to);
        request.setMessage(message);

        return request;
    }
}
