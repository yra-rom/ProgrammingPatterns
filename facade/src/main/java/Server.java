public interface Server {

    void boot();
    void init();
    void readContextFile();
    void initContext();
    void initListeners();
    void deployWebapps();

    void releaseProcesses();
    void undeploy();
    void deleteListeners();
    void deleteContext();
    void shutDown();
}
