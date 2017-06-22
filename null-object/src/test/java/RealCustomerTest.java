import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class RealCustomerTest {

    private RealCustomer customer;

    @Before
    public void initCustomer(){
        customer = new RealCustomer("Becky");
    }

    @Test
    public void getName() throws Exception {
        String name = customer.getName();
        assertEquals("Becky", name);
    }

    @Test
    public void getProducts() throws Exception {
        List basket = customer.getBasket();
        assertNotNull(basket);
    }

    @Test
    public void addToBasket() throws Exception {
        customer.addToBasket("apple");
        List basket = customer.getBasket();

        assertNotNull(basket);
        assertFalse(basket.isEmpty());
    }

}