import org.junit.Test;

import static org.junit.Assert.*;

public class SynchronizedAccessorSingletonTest {
    @Test
    public void tgetInstance(){
        SynchronizedAccessorSingleton instance1 = SynchronizedAccessorSingleton.getInstance();
        SynchronizedAccessorSingleton instance2 = SynchronizedAccessorSingleton.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);

        assertEquals(instance1, instance2);
        assertSame(instance1, instance2);
    }
}