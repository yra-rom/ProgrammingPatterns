package abstract_factory.creator;

import abstract_factory.os.OSType;
import abstract_factory.window.Window;
import abstract_factory.factory.AbstractWidgetFactory;
import abstract_factory.factory.LinuxWidgetFactory;
import abstract_factory.factory.MSWidgetFactory;
import abstract_factory.factory.MacOSWidgetFactory;

public class GUICreator {

    private AbstractWidgetFactory widgetFactory;

    public GUICreator(OSType type){
        switch (type){
            case Linux :
                this.widgetFactory = new LinuxWidgetFactory();
                break;
            case Windows :
                this.widgetFactory = new MSWidgetFactory();
                break;
            case MacOS :
                this.widgetFactory = new  MacOSWidgetFactory();
                break;
        }
    }

    public Window createWindow(){
        Window window = widgetFactory.createWindow();
        window.setTitle("New Window");

        return window;
    }
}
