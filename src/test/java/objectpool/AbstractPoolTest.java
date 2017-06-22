package objectpool;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertNotNull;

public class AbstractPoolTest {

    private Pool<Connection> pool;


    @Before
    public void init() {
        pool = new ConnectionPool(new ConnectionCreator());
    }


    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void checkInNull() throws Exception {
        exception.expect(NullPointerException.class);
        pool.checkIn(null);
    }

    @Test
    public void checkInOut() throws Exception {
        Connection con1 = pool.checkOut();
        Connection con2 = pool.checkOut();
        Connection con3 = pool.checkOut();
        Connection con4 = pool.checkOut();

        assertNotNull(con1);
        assertNotNull(con2);
        assertNotNull(con3);
        assertNotNull(con4);

        pool.checkIn(con1);
        pool.checkIn(con2);
        pool.checkIn(con3);
        pool.checkIn(con4);

        con1 = pool.checkOut();
        con2 = pool.checkOut();
        con3 = pool.checkOut();
        con4 = pool.checkOut();

        assertNotNull(con1);
        assertNotNull(con2);
        assertNotNull(con3);
        assertNotNull(con4);
    }

}