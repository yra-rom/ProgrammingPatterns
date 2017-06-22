import java.util.List;

public abstract class AbstractCustomer {
    protected String name;
    protected List<String> basket;

    public abstract String getName();
    public abstract List<String> getBasket();

    public abstract void addToBasket(String productName);

}
