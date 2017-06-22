public class ConnectionCreator implements Creator<Connection> {
    @Override
    public Connection create() {
        return new Connection();
    }
}
