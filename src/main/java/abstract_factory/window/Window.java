package abstract_factory.window;

import abstract_factory.elements.Element;

public interface Window {
    boolean addElement(Element element);
    void redraw();
    void setTitle(String title);
    String getTitle();
}
