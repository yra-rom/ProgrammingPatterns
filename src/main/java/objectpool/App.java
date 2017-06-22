package objectpool;

public class App {
    public static void main(String[] args) {
        Pool<Connection> pool = new ConnectionPool(new ConnectionCreator());

        Connection connection = pool.checkOut();
        pool.checkIn(connection);

        Connection connection1 = pool.checkOut();
        pool.checkIn(connection1);

        Connection connection2 = pool.checkOut();
        pool.checkIn(connection2);
    }
}
