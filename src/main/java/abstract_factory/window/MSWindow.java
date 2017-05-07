package abstract_factory.window;

import abstract_factory.elements.Element;
import abstract_factory.elements.MSElement;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class MSWindow implements Window {

    @Getter
    @Setter
    private String title;

    private ArrayList<Element> elements = new ArrayList<>();

    @Override
    public boolean addElement(Element element) {
        boolean returnValue = false;

        if(element instanceof MSElement){
            returnValue = elements.add(element);
        }

        return returnValue;
    }

    @Override
    public void redraw() {
        System.out.println("MSWindow was refreshed");
    }

}
