import org.junit.Test;

import static org.junit.Assert.*;

public class HolderSingletonTest {
    @Test
    public void getInstance() throws Exception {
        HolderSingleton instance1 = HolderSingleton.getInstance();
        HolderSingleton instance2 = HolderSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertEquals(instance1, instance2);
        assertSame(instance1, instance2);
    }
}