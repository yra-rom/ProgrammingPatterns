package abstract_factory;

public class MSWindow implements Window {
    @Override
    public void addElement() {
        System.out.println("Element added to MSWindow.");
    }

    @Override
    public void redraw() {
        System.out.println("MSWindow was refreshed");
    }

    @Override
    public void setTitle(String title) {
        System.out.println("MSWindow new title: " + title);
    }
}
