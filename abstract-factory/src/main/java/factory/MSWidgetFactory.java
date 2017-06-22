package factory;


import window.MSWindow;
import window.Window;

public class MSWidgetFactory implements AbstractWidgetFactory {

    @Override
    public Window createWindow() {
        return new MSWindow();
    }
}
