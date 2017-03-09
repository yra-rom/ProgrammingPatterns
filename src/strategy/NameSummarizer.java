package strategy;

import builder.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class NameSummarizer implements SummarizeStrategy {
    private Comparator<User> comparator = Comparator.comparing(User::getName);

    @Override
    public String summarize(Set<User> users) {
        StringBuilder summarized = new StringBuilder();
        List<User> list = new ArrayList<>(users);
        list.sort(comparator);
        for(User user  : list){
            String builder = user.getName() + "\t" + user.getSurname() + "\t|\t" +
                    user.getEmail() + "\t|\t" + user.getAge() + " y." + "\t|\t" +
                    user.getCountry() + "\t|\t" + "\n";
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
            String builder = user.getName() + "\t" + user.getSurname() + "\t|\t" +
                    user.getEmail() + "\t|\t" + user.getAge() + " y." + "\t|\t" +
                    user.getCountry() + "\t|\t";
            summarized.add(builder);
        }

        return summarized;
    }

}
