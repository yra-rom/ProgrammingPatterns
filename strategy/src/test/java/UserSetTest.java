import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.Assert.*;

public class UserSetTest {

    private static UserSet userSet;

    @BeforeClass
    public static void initUserSet() {
        userSet = new UserSet();
        User user1 = new User.UserBuilder()
                .name("Allan")
                .surname("Task")
                .email("allan@mail.com")
                .age(20)
                .country("USA")
                .id("1")
                .build();

        User user2 = new User.UserBuilder()
                .name("Becky")
                .surname("McDonald")
                .email("abecky@mail.com")
                .age(25)
                .country("UK")
                .id("2")
                .build();

        User user3 = new User.UserBuilder()
                .name("Do")
                .surname("Can")
                .email("docan@mail.com")
                .age(39)
                .country("France")
                .id("3")
                .build();

        User user4 = new User.UserBuilder()
                .name("Yes")
                .surname("Man")
                .email("yesman@mail.com")
                .age(27)
                .country("Moldova")
                .id("4")
                .build();

        User user5 = new User.UserBuilder()
                .name("Meggie")
                .surname("Stinson")
                .email("meggie@mail.com")
                .age(18)
                .country("Italy")
                .id("5")
                .build();

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);
    }

    @Test
    public void summarize() throws Exception {
        SummarizeStrategy summarizer = new NameSummarizer();
        userSet.setSummarizer(summarizer);

        String summary = summarizer.summarize(userSet);

        assertNotNull(summary);
        assertNotEquals("", summary);
    }

    @Test
    public void summarizeToList() throws Exception {
        SummarizeStrategy summarizer = new AgeSummarizer();
        userSet.setSummarizer(summarizer);

        List<String> summary = summarizer.summarizeToList(userSet);

        assertNotNull(summary);
        assertEquals(5, summary.size());
    }

    @Test
    public void setSummarizer() throws Exception {
        SummarizeStrategy summarizer = new NameSummarizer();
        userSet.setSummarizer(summarizer);

        Field summarizerField = userSet.getClass().getDeclaredField("summarizer");
        summarizerField.setAccessible(true);

        SummarizeStrategy summarize = (SummarizeStrategy) summarizerField.get(userSet);

        assertNotNull(summarize);
        assertTrue(summarize instanceof NameSummarizer);
    }

}