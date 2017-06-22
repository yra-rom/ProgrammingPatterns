import org.junit.Test;

import static org.junit.Assert.*;

public class StaticFieldSingletonTest {
    @Test
    public void getInstance() throws Exception {
        StaticFieldSingleton instance1 = StaticFieldSingleton.getInstance();
        StaticFieldSingleton instance2 = StaticFieldSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertEquals(instance1, instance2);
        assertSame(instance1, instance2);
    }
}