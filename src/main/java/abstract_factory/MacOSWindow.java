package abstract_factory;

public class MacOSWindow implements Window {
    @Override
    public void addElement() {
        System.out.println("Element added to MacOsWindow.");
    }

    @Override
    public void redraw() {
        System.out.println("MacOsWindow was refreshed");
    }

    @Override
    public void setTitle(String title) {
        System.out.println("MacOsWindow new title: " + title);
    }
}
