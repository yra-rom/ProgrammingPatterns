package abstract_factory.factory;

import abstract_factory.window.Window;
import abstract_factory.window.LinuxWindow;

public class LinuxWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
