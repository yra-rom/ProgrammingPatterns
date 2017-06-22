public class ConnectionPool extends AbstractPool<Connection> {

    public ConnectionPool(Creator<Connection> creator) {
        super(creator);
    }

    public ConnectionPool(Creator<Connection> creator, int maxConnection) {
        super(creator, maxConnection);
    }

    @Override
    protected Connection create() {
        return creator.create();
    }

}
