package creator;


import factory.AbstractWidgetFactory;
import factory.LinuxWidgetFactory;
import factory.MSWidgetFactory;
import factory.MacOSWidgetFactory;
import org.junit.Test;
import os.OSType;
import window.LinuxWindow;
import window.MSWindow;
import window.MacOSWindow;
import window.Window;

import java.lang.reflect.Field;

import static org.junit.Assert.assertTrue;

public class GUICreatorTest {

    @Test
    public void testConstructorForWindows() throws NoSuchFieldException, IllegalAccessException {
        GUICreator creator = new GUICreator(OSType.Windows);

        Field factoryField = creator.getClass().getDeclaredField("widgetFactory");
        factoryField.setAccessible(true);
        AbstractWidgetFactory widgetFactory = (AbstractWidgetFactory) factoryField.get(creator);
        factoryField.setAccessible(false);

        assertTrue(widgetFactory instanceof MSWidgetFactory);
    }

    @Test
    public void testConstructorForLinux() throws NoSuchFieldException, IllegalAccessException {
        GUICreator creator = new GUICreator(OSType.Linux);

        Field factoryField = creator.getClass().getDeclaredField("widgetFactory");
        factoryField.setAccessible(true);
        AbstractWidgetFactory widgetFactory = (AbstractWidgetFactory) factoryField.get(creator);
        factoryField.setAccessible(false);

        assertTrue(widgetFactory instanceof LinuxWidgetFactory);
    }

    @Test
    public void testConstructorForMac() throws NoSuchFieldException, IllegalAccessException {
        GUICreator creator = new GUICreator(OSType.MacOS);

        Field factoryField = creator.getClass().getDeclaredField("widgetFactory");
        factoryField.setAccessible(true);
        AbstractWidgetFactory widgetFactory = (AbstractWidgetFactory) factoryField.get(creator);
        factoryField.setAccessible(false);

        assertTrue(widgetFactory instanceof MacOSWidgetFactory);
    }

    @Test
    public void testCreateWindowForWindows(){
        GUICreator creator = new GUICreator(OSType.Windows);
        Window window = creator.createWindow();

        assertTrue(window instanceof MSWindow);
    }

    @Test
    public void testCreateWindowForLinux(){
        GUICreator creator = new GUICreator(OSType.Linux);
        Window window = creator.createWindow();

        assertTrue(window instanceof LinuxWindow);
    }

    @Test
    public void testCreateWindowForMac(){
        GUICreator creator = new GUICreator(OSType.MacOS);
        Window window = creator.createWindow();

        assertTrue(window instanceof MacOSWindow);
    }
}
