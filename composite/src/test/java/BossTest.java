import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BossTest {
    private Employee boss;

    @Before
    public void initBoss(){
        String bossName = "Big Boss";
        Double salary = 1_000_000.;
        boss = new Boss(bossName, salary);
    }

    @Test
    public void hireEmployee(){
        Employee javaCoder = new Developer("Nelson", 10_000.);
        Employee cppCoder = new Developer("Dick", 5_000.);

        boolean employedJavaCoder = boss.hireEmployee(javaCoder);
        boolean employedCppCoder = boss.hireEmployee(cppCoder);

        assertTrue(employedJavaCoder);
        assertTrue(employedCppCoder);
    }

    @Test
    public void fireEmployee(){
        Employee javaCoder = new Developer("Nelson", 10_000.);
        Employee cppCoder = new Developer("Dick", 5_000.);

        boss.hireEmployee(javaCoder);
        boss.hireEmployee(cppCoder);

        boolean firedJavaCoder = boss.fireEmployee(javaCoder);
        boolean firedCppCoder = boss.fireEmployee(cppCoder);

        assertTrue(firedJavaCoder);
        assertTrue(firedCppCoder);
    }

    @Test
    public void getEmployees(){
        Employee javaCoder = new Developer("Nelson", 10_000.);
        Employee cppCoder = new Developer("Dick", 5_000.);

        boss.hireEmployee(javaCoder);
        boss.hireEmployee(cppCoder);


        Set employees = boss.getEmployees();
        assertTrue(employees.contains(javaCoder));
        assertTrue(employees.contains(cppCoder));
    }
}