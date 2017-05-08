package prototype;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PrototypeTest {

    @Test
    public void testClone(){
        User user = new User();
        user.setAge(22);
        user.setCountry("Poland");
        user.setName("Damian");

        User userClone = (User) user.copy();

        assertTrue(user.equals(userClone));
    }
}
