import creator.GUICreatorTest;
import factory.WidgetFactoryTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import window.LinuxWindowTest;
import window.MSWindowTest;
import window.MacOsWindowTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        GUICreatorTest.class,
        WidgetFactoryTest.class,
        LinuxWindowTest.class,
        MacOsWindowTest.class,
        MSWindowTest.class
})
public class TestRunner {}