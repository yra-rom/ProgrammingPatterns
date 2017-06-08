package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnumSingletonTest {
    @Test
    public void getInstance(){
        EnumSingleton instance =  EnumSingleton.INSTANCE;
        assertNotNull(instance);
    }
}