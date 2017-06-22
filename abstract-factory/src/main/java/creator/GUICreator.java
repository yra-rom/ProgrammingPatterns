package creator;


import factory.AbstractWidgetFactory;
import factory.LinuxWidgetFactory;
import factory.MSWidgetFactory;
import factory.MacOSWidgetFactory;
import os.OSType;
import window.Window;

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
                this.widgetFactory = new MacOSWidgetFactory();
                break;
        }
    }

    public Window createWindow(){
        Window window = widgetFactory.createWindow();
        window.setTitle("New Window");

        return window;
    }
}
