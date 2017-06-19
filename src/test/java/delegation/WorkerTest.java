package delegation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorkerTest {
    @Test
    public void doWork(){
        Boss boss = new Boss();
        boss.hireManager(new Manager());

        assertEquals("Work done by manager", boss.doWork());
    }
}