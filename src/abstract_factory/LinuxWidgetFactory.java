package abstract_factory;

public class LinuxWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
