import java.util.concurrent.TimeUnit;

public class CatDogServer implements Server {
    @Override
    public void boot() {
        System.out.print("Start booting...");
        process();
        System.out.println("[OK]");
    }

    @Override
    public void init() {
        System.out.print("Initializing server...");
        process();
        System.out.println("[OK]");
    }

    @Override
    public void readContextFile() {
        System.out.print("Reading context file...");
        process();
        System.out.println("[OK]");
    }

    @Override
    public void initContext() {
        System.out.print("Initializing context...");
        process();
        System.out.println("[OK]");
    }

    @Override
    public void initListeners() {
        System.out.print("Initializing context...");
        process();
        System.out.println("[OK]");
    }

    @Override
    public void deployWebapps() {
        System.out.print("Deploying artifacts...");
        process();
        System.out.println("[OK]");
    }

    @Override
    public void releaseProcesses() {
        System.out.print("Releasing processes...");
        process();
        System.out.println("[OK]");
    }

    @Override
    public void undeploy() {
        System.out.print("Undeploying artifacts...");
        process();
        System.out.println("[OK]");
    }

    @Override
    public void deleteListeners() {
        System.out.print("Removing listeners...");
        process();
        System.out.println("[OK]");
    }

    @Override
    public void deleteContext() {
        System.out.print("Deleting context...");
        process();
        System.out.println("[OK]");
    }

    @Override
    public void shutDown() {
        System.out.print("Shutting down...");
        process();
        System.out.println("[OK]");
    }

    private void process(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
