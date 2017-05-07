package abstract_factory.factory;

import abstract_factory.window.LinuxWindow;
import abstract_factory.window.MSWindow;
import abstract_factory.window.MacOSWindow;
import abstract_factory.window.Window;
import org.junit.Test;

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
