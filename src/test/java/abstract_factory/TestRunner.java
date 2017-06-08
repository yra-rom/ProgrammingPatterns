package abstract_factory;

import abstract_factory.creator.GUICreatorTest;
import abstract_factory.factory.WidgetFactoryTest;
import abstract_factory.window.LinuxWindowTest;
import abstract_factory.window.MSWindowTest;
import abstract_factory.window.MacOsWindowTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        GUICreatorTest.class,
        WidgetFactoryTest.class,
        LinuxWindowTest.class,
        MacOsWindowTest.class,
        MSWindowTest.class
})
public class TestRunner {}