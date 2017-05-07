package abstract_factory.window;

import abstract_factory.elements.Element;
import abstract_factory.elements.LinuxElement;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class LinuxWindow implements Window {

    @Getter
    @Setter
    private String title;

    private ArrayList<Element> elements = new ArrayList<>();

    @Override
    public boolean addElement(Element element) {
        boolean returnValue = false;

        if(element instanceof LinuxElement){
            returnValue = elements.add(element);
        }

        return returnValue;
    }


    @Override
    public void redraw() {
        System.out.println("LinuxWindow was refreshed");
    }
}
