package abstract_factory;

public class GUICreator {
    private AbstractWidgetFactory widgetFactory;
    public GUICreator(OSType type){
        switch (type){
            case Linux :
                this.widgetFactory = new LinuxWidgetFactory();
                break;
            case Windows :
                this.widgetFactory = new MacOSWidgetFactory();
                break;
            case MacOS :
                this.widgetFactory = new MSWidgetFactory();
                break;
        }
    }
    public void createWindow(){
        Window window = widgetFactory.createWindow();
        window.setTitle("New Window");
    }
}
