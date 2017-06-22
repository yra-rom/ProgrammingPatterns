package factory;

import org.junit.Test;
import window.LinuxWindow;
import window.MSWindow;
import window.MacOSWindow;
import window.Window;

import static org.junit.Assert.assertTrue;

public class WidgetFactoryTest {

    @Test
    public void testLinuxFactory(){
        AbstractWidgetFactory factory = new LinuxWidgetFactory();
        Window window = factory.createWindow();

        assertTrue(window instanceof LinuxWindow);
    }

    @Test
    public void testWindowsFactory(){
        AbstractWidgetFactory factory = new MSWidgetFactory();
        Window window = factory.createWindow();

        assertTrue(window instanceof MSWindow);
    }

    @Test
    public void testMacFactory(){
        AbstractWidgetFactory factory = new MacOSWidgetFactory();
        Window window = factory.createWindow();

        assertTrue(window instanceof MacOSWindow);
    }
}
