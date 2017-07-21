package communicate;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private Status status;
    private String message;
}
