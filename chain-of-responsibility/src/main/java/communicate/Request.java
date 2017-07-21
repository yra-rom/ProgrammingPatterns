package communicate;

import lombok.*;

@Getter
@Setter
public class Request {
    private String fromIp;
    private String toIp;
    private String message;
}
