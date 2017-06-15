package proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void cloneUser() throws Exception {
        User userOriginal = new User("1", "Jecky", "Fast");
        User userClone = userOriginal.clone();

        assertNotNull(userClone);
        assertEquals(userOriginal, userClone);
        assertNotSame(userOriginal, userClone);
    }

}