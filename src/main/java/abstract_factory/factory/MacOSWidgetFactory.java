package abstract_factory.factory;

import abstract_factory.window.Window;
import abstract_factory.window.MacOSWindow;

public class MacOSWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }
}
