package strategy;

import builder.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class AgeSummarizer implements SummarizeStrategy {
    private Comparator<User> comparator = Comparator.comparing(User::getAge);

    @Override
    public String summarize(Set<User> users) {
        StringBuilder summarized = new StringBuilder();
        List<User> list = new ArrayList<>(users);
        list.sort(comparator);

        for(User user  : list){
            String builder = user.getAge() + " y." + "\t|\t" +
                    user.getName() + "\t" + user.getSurname() + "\t|\t" +
                    user.getEmail() + "\t|\t" + user.getCountry() + "\t|\t" + "\n";
            summarized.append(builder);
        }
        return summarized.toString();
    }

    @Override
    public ArrayList<String> summarizeToList(Set<User> users) {
        ArrayList<String> summarized = new ArrayList<>();

        List<User> list = new ArrayList<>(users);
        list.sort(comparator);

        for(User user  : users){
            String builder = user.getAge() + " y." + "\t|\t" +
                    user.getName() + "\t" + user.getSurname() + "\t|\t" +
                    user.getEmail() + "\t|\t" + user.getCountry() + "\t|\t" + "\n";
            summarized.add(builder);
        }

        return summarized;
    }
}
