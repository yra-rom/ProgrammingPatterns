package abstract_factory;

public class MSWidgetFactory implements AbstractWidgetFactory {

    @Override
    public Window createWindow() {
        return new MSWindow();
    }
}
