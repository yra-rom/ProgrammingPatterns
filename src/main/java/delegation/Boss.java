package delegation;

public class Boss implements Worker {

    private Manager manager;

    @Override
    public String doWork() {
        return  manager.doWork();
    }

    public void hireManager(Manager manager){
        this.manager = manager;
    }
}
