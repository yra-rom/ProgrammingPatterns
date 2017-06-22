import org.junit.Test;

import static org.junit.Assert.assertNotSame;

public class ImmutablePointTest {
    @Test
    public void offset() throws Exception {
        ImmutablePoint point = new ImmutablePoint(0,0);
        ImmutablePoint point1 = point.offset(1,1);

        assertNotSame(point, point1);
    }

}