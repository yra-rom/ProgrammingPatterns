import abstract_factory.GUICreator;
import abstract_factory.OSType;
import builder.User;
import iterator.Iterator;
import iterator.LinkedList;
import observer.ConcreteObservable;
import observer.ConcreteObserver;
import observer.Observable;
import observer.Observer;
import singleton.*;

public class Main {

    private static void useBuilder(){
        User user = new User.UserBuilder().
                name("Johny").
                surname("Westside").
                age(33).
                email("johny.westside@westside.com").
                id("777").
                country("USA").
                build();

        System.out.println( "Name: " + user.getName() + "\n" +
                            "Surname: " + user.getSurname() + "\n" +
                            "Age: " + user.getAge() + "\n" +
                            "Email: " + user.getEmail() + "\n" +
                            "Id: " + user.getId() + "\n" +
                            "Country: " + user.getCountry());
    }

    private static void useSingleton(){
        StaticFieldSingleton singleton1 = StaticFieldSingleton.INSTANCE;
        StaticFieldSingleton singleton2 = StaticFieldSingleton.getInstance();

        EnumSingleton singleton3 = EnumSingleton.INSTANCE;

        SynchronizedAccessorSingleton singleton4 = SynchronizedAccessorSingleton.getInstance();

        DoubleLockingSingleton singleton5 = DoubleLockingSingleton.getInstance();

        HolderSingleton singleton6 = HolderSingleton.getInstance();
    }

    private static void useAbstractFactory(){
        GUICreator creator = new GUICreator(OSType.Linux);
        creator.createWindow();
    }

    private static void useIterator(){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 11; ++i) {
            list.add(i);
        }
        list.showList();

        Iterator<Integer> iter = list.iterator();
        System.out.println(iter.hasNext());
        iter.remove();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        list.showList();
    }

    private static void useObserver(){
        Observable observable = new ConcreteObservable();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        Observer observer3 = new ConcreteObserver();
        Observer observer4 = new ConcreteObserver();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        observable.addObserver(observer4);

        observable.removeObserver(observer3);
        observable.notifyObserver();
    }

    public static void main(String[] args) {
        useObserver();
    }
}
