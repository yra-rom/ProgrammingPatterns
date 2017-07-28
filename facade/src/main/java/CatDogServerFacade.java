public class CatDogServerFacade implements ServerFacade {
    private final Server server;

    public CatDogServerFacade(Server server) {
        this.server = server;
    }

    @Override
    public void startServer() {
        server.boot();
        server.init();
        server.readContextFile();
        server.initContext();
        server.initListeners();
        server.deployWebapps();
    }

    @Override
    public void stopServer() {
        server.releaseProcesses();
        server.undeploy();
        server.deleteListeners();
        server.deleteContext();
        server.shutDown();
    }
}
