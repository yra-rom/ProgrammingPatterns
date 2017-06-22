import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectionPoolTest {

    private Pool<Connection> pool;

    @Before
    public void init(){
        pool = new ConnectionPool(new ConnectionCreator());
    }

    @Test
    public void createSame() throws Exception {
        Connection connection = pool.checkOut();
        pool.checkIn(connection);

        Connection connection1 = pool.checkOut();
        pool.checkIn(connection);

        assertNotNull(connection);
        assertNotNull(connection1);

        assertSame(connection, connection1);
    }

    @Test
    public void createDefaultMax() throws Exception {
        Connection connection1 = pool.checkOut();
        Connection connection2 = pool.checkOut();
        Connection connection3 = pool.checkOut();
        Connection connection4 = pool.checkOut();


        assertNotNull(connection1);
        assertNotNull(connection2);
        assertNotNull(connection3);
        assertNotNull(connection4);

        assertNotSame(connection1, connection2);
        assertNotSame(connection2, connection3);
        assertNotSame(connection3, connection4);
    }

    @Test
    public void createCustomMax() throws Exception {
        pool = new ConnectionPool(new ConnectionCreator(), 6);
        Connection connection1 = pool.checkOut();
        Connection connection2 = pool.checkOut();
        Connection connection3 = pool.checkOut();
        Connection connection4 = pool.checkOut();
        Connection connection5 = pool.checkOut();
        Connection connection6 = pool.checkOut();


        assertNotNull(connection1);
        assertNotNull(connection2);
        assertNotNull(connection3);
        assertNotNull(connection4);
        assertNotNull(connection5);
        assertNotNull(connection6);

        assertNotSame(connection1, connection2);
        assertNotSame(connection2, connection3);
        assertNotSame(connection3, connection4);
        assertNotSame(connection4, connection5);
        assertNotSame(connection5, connection6);
    }

    @Test
    public void createNull() throws Exception {
        pool.checkOut();
        pool.checkOut();
        pool.checkOut();
        pool.checkOut();
        Connection connection = pool.checkOut();


        assertNull(connection);
    }

}