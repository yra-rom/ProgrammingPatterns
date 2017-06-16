package nullobject;

import java.util.List;

public class NullCustomer extends AbstractCustomer {

    private NullCustomer() {
    }

    private static NullCustomer _instance;

    public static synchronized NullCustomer getInstance() {
        if (_instance == null) {
            _instance = new NullCustomer();
        }

        return _instance;
    }

    @Override
    public String getName() {
        return "Empty Name";
    }

    @Override
    public List<String> getBasket() {
        return null;
    }

    @Override
    public void addToBasket(String productName) {
        //doing nothing
    }
}
