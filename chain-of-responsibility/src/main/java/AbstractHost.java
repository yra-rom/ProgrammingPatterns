import communicate.Request;
import communicate.Response;
import communicate.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractHost implements Host {
    protected String ip;
    protected Host nextHop;

    public AbstractHost(String ip) {
        this.ip = ip;
    }

    @Override
    public Response connect(Request request) {
        if (request.getToIp().equals(this.ip)) {
            return accept(request);
        } else {
            if (nextHop != null) {
                return nextHop.connect(request);
            } else {
                return new Response(Status.HOST_UNREACHABLE, "404");
            }
        }
    }

    private Response accept(Request request) {
        Response response = new Response();
        response.setStatus(Status.ACCEPTED);
        response.setMessage(this.getClass().getSimpleName() + ": Request accepted.\n\t" + request.getMessage());
        return response;
    }
}
