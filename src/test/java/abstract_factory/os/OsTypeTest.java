package abstract_factory.os;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class OsTypeTest {
    @Test
    public void testEnumValues(){
        assertThat(OSType.Linux, is(notNullValue()));
        assertThat(OSType.Windows, is(notNullValue()));
        assertThat(OSType.MacOS, is(notNullValue()));
    }
}
