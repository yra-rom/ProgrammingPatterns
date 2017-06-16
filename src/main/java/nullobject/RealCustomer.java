package nullobject;

import java.util.LinkedList;
import java.util.List;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
        this.basket = new LinkedList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getBasket() {
        return basket;
    }

    @Override
    public void addToBasket(String productName) {
        basket.add(productName);
    }
}
