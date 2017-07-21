import communicate.Request;
import communicate.Response;

public interface Host {
    Response connect(Request request);
    String getIp();
    Host getNextHop();
    void setNextHop(Host host);
}
