import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ConcreteObservableTest {

    @Test
    public void testAddObserver() throws NoSuchFieldException, IllegalAccessException {
        Observable observable = new ConcreteObservable();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        Field observersField = observable.getClass().getDeclaredField("observers");
        observersField.setAccessible(true);
        ArrayList<Observer> observers = (ArrayList<Observer>) observersField.get(observable);

        assertEquals(2, observers.size());
        assertTrue(observers.contains(observer1));
        assertTrue(observers.contains(observer2));
    }

    @Test
    public void testRemoveObserver() throws NoSuchFieldException, IllegalAccessException {
        Observable observable = new ConcreteObservable();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        Field observersField = observable.getClass().getDeclaredField("observers");
        observersField.setAccessible(true);
        ArrayList<Observer> observers = (ArrayList<Observer>) observersField.get(observable);

        observable.removeObserver(observer1);
        assertFalse(observers.contains(observer1));
        observable.removeObserver(observer2);
        assertFalse(observers.contains(observer2));
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testNotifyObserver() throws NoSuchFieldException, IllegalAccessException {
        Observable observable = new ConcreteObservable();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.notifyObserver();

        String expected = observer1 + ": handling event" + "\r\n"
                + observer2 + ": handling event" + "\r\n";

        String actual = outContent.toString();
        assertEquals(expected, actual);
    }

}
