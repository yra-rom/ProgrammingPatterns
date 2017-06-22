package factory;


import window.MacOSWindow;
import window.Window;

public class MacOSWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }
}
