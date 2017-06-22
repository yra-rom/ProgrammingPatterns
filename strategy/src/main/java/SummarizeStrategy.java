import java.util.ArrayList;
import java.util.Set;

public interface SummarizeStrategy extends Strategy{
    String summarize(Set<User> users);
    ArrayList<String> summarizeToList(Set<User> users);
}
