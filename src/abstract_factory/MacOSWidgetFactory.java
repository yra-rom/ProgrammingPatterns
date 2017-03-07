package abstract_factory;

public class MacOSWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }
}
