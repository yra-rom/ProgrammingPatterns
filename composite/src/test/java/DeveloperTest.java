import org.joda.money.Money;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Set;

import static org.junit.Assert.*;

public class DeveloperTest {

    private Employee developer;

    @Before
    public void initDeveloper() {
        String name = "Jack";
        Money salary = Money.parse("USD 10000");
        developer = new Developer(name, salary);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void hireEmployee() throws Exception {
        exception.expect(UnsupportedOperationException.class);
        developer.hireEmployee(new Developer("Someone", Money.parse("USD 100")));
    }

    @Test
    public void fireEmployee() throws Exception {
        exception.expect(UnsupportedOperationException.class);
        developer.fireEmployee(new Developer("Someone", Money.parse("USD 100")));
    }

    @Test
    public void getEmployees() throws Exception {
        exception.expect(UnsupportedOperationException.class);
        developer.getEmployees();
    }

}