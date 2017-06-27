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
        developer = new Developer("Jack", 10_000.);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void hireEmployee() throws Exception {
        exception.expect(UnsupportedOperationException.class);
        developer.hireEmployee(new Developer("Someone", 0.));
    }

    @Test
    public void fireEmployee() throws Exception {
        exception.expect(UnsupportedOperationException.class);
        developer.fireEmployee(new Developer("Someone", 0.));
    }

    @Test
    public void getEmployees() throws Exception {
        exception.expect(UnsupportedOperationException.class);
        developer.getEmployees();
    }

}