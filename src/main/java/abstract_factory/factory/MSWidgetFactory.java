package abstract_factory.factory;

import abstract_factory.window.Window;
import abstract_factory.window.MSWindow;

public class MSWidgetFactory implements AbstractWidgetFactory {

    @Override
    public Window createWindow() {
        return new MSWindow();
    }
}
