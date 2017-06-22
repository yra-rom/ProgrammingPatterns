import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;

public class UserSet extends HashSet<User> {
    @Setter
    private SummarizeStrategy summarizer;

    public String summarize(){
        if(summarizer == null) {
            return null;
        }
        return summarizer.summarize(this);
    }

    public ArrayList<String> summarizeToList(){
        if(summarizer == null) {
            return null;
        }
        return summarizer.summarizeToList(this);
    }

}
