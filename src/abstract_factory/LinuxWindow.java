package abstract_factory;

public class LinuxWindow implements Window {
    @Override
    public void addElement() {
        System.out.println("Element added to LinuxWindow.");
    }

    @Override
    public void redraw() {
        System.out.println("LinuxWindow was refreshed");
    }

    @Override
    public void setTitle(String title) {
        System.out.println("LinuxWindow new title: " + title);
    }
}
