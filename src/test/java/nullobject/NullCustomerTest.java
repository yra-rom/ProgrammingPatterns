package nullobject;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NullCustomerTest {

    private NullCustomer customer;

    @Before
    public void initCustomer(){
        customer = NullCustomer.getInstance();
    }

    @Test
    public void getInstance() throws Exception {
        NullCustomer customer = NullCustomer.getInstance();
        assertNotNull(customer);

        NullCustomer customer1 = NullCustomer.getInstance();
        NullCustomer customer2 = NullCustomer.getInstance();

        assertSame(customer1, customer2);
    }

    @Test
    public void getName() throws Exception {
        String emptyName = customer.getName();
        assertEquals("Empty Name", emptyName);
    }

    @Test
    public void getProducts() throws Exception {
        List basket = customer.getBasket();
        assertNull(basket);
    }

    @Test
    public void addToBasket() throws Exception {
        customer.addToBasket("Orange");
        List basket = customer.getBasket();
        assertNull(basket);
    }

}