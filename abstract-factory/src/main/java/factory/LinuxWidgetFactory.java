package factory;


import window.LinuxWindow;
import window.Window;

public class LinuxWidgetFactory implements AbstractWidgetFactory {
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
