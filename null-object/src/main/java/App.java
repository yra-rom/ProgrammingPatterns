public class App {
    public static void main(String[] args) {
        NullCustomer nullCustomer = NullCustomer.getInstance();
        System.out.println(nullCustomer.getName());
        nullCustomer.addToBasket("Cola");
        System.out.println(nullCustomer.getBasket());
    }
}
