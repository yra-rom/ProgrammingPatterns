package abstract_factory.window;

import abstract_factory.elements.Element;
import abstract_factory.elements.LinuxElement;
import abstract_factory.elements.MSElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class MSWindowTest {

    @Test
    public void testAddElementSuccess() throws NoSuchFieldException, IllegalAccessException {
        Window window = new MSWindow();
        Element element = new MSElement();
        boolean value = window.addElement(element);

        assertTrue(value);

        Field factoryField = window.getClass().getDeclaredField("elements");
        factoryField.setAccessible(true);
        ArrayList<Element> elements = (ArrayList<Element>) factoryField.get(window);
        factoryField.setAccessible(false);

        assertTrue(elements.contains(element));
    }

    @Test
    public void testAddElementFail() throws NoSuchFieldException, IllegalAccessException {
        Window window = new MSWindow();
        Element element = new LinuxElement();
        boolean value = window.addElement(element);

        assertFalse(value);

        Field factoryField = window.getClass().getDeclaredField("elements");
        factoryField.setAccessible(true);
        ArrayList<Element> elements = (ArrayList<Element>) factoryField.get(window);
        factoryField.setAccessible(false);

        assertFalse(elements.contains(element));
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testRedraw(){
        Window window = new MSWindow();
        window.redraw();

        String expected = "MSWindow was refreshed" + "\r\n";
        String actual = outContent.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetTitle(){
        String title = "Custom Title 404";

        Window window = new LinuxWindow();
        window.setTitle(title);

        assertEquals(title, window.getTitle());
    }
}
