import org.joda.money.Money;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

import static org.junit.Assert.*;

public class BossTest {
    private Employee boss;

    @Before
    public void initBoss() {
        String bossName = "Big Boss";
        Money salary = Money.parse("USD 100000");
        boss = new Boss(bossName, salary);
    }

    @Test
    public void checkBoss() {
        assertNull(boss.getBoss());
    }

    @Test
    public void hireEmployee() {
        Employee javaCoder = new Developer("Nelson", Money.parse("USD 10000"));
        Employee cppCoder = new Developer("Dick", Money.parse("USD 5000"));

        boolean employedJavaCoder = boss.hireEmployee(javaCoder);
        boolean employedCppCoder = boss.hireEmployee(cppCoder);

        assertTrue(employedJavaCoder);
        assertTrue(employedCppCoder);

        assertSame(boss, javaCoder.getBoss());
        assertSame(boss, cppCoder.getBoss());
    }

    @Test
    public void fireEmployee() {
        Employee javaCoder = new Developer("Nelson", Money.parse("USD 10000"));
        Employee cppCoder = new Developer("Dick", Money.parse("USD 5000"));

        boss.hireEmployee(javaCoder);
        boss.hireEmployee(cppCoder);

        boolean firedJavaCoder = boss.fireEmployee(javaCoder);
        boolean firedCppCoder = boss.fireEmployee(cppCoder);

        assertTrue(firedJavaCoder);
        assertTrue(firedCppCoder);

        assertNull(javaCoder.getBoss());
        assertNull(cppCoder.getBoss());
    }

    @Test
    public void getEmployees() {
        Employee javaCoder = new Developer("Nelson", Money.parse("USD 5000"));
        Employee cppCoder = new Developer("Dick", Money.parse("USD 5000"));

        boss.hireEmployee(javaCoder);
        boss.hireEmployee(cppCoder);

        Set employees = boss.getEmployees();

        assertTrue(employees.contains(javaCoder));
        assertTrue(employees.contains(cppCoder));
    }
}