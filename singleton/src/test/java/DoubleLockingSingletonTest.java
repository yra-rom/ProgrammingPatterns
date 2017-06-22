import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleLockingSingletonTest {
    @Test
    public void getInstance() throws Exception {
        DoubleLockingSingleton instance1 = DoubleLockingSingleton.getInstance();
        DoubleLockingSingleton instance2 = DoubleLockingSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertEquals(instance1, instance2);
        assertSame(instance1, instance2);
    }

}