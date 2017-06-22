public class App {
    public static void main(String[] args) {
        Observable observable = new ConcreteObservable();
        observable.addObserver(new ConcreteObserver());
        observable.notifyObserver();
    }
}
