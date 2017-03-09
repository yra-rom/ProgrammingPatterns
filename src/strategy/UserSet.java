package strategy;

import builder.User;

import java.util.ArrayList;
import java.util.HashSet;

public class UserSet extends HashSet<User> {
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

    public void setSummarizer(SummarizeStrategy summarizer) {
        this.summarizer = summarizer;
    }
}
