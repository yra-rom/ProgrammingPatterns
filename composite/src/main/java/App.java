import org.joda.money.Money;

public class App {
    public static void main(String[] args) {
        Employee boss = new Boss("Boss", Money.parse("USD 100000"));
        Employee javaCoder = new Developer("Java Coder", Money.parse("USD 10000"));
        Employee cppCoder = new Developer("Cpp coder", Money.parse("USD 15000"));

        boss.hireEmployee(javaCoder);
        boss.hireEmployee(cppCoder);

        Employee bigBoss = new Boss("Big Boss", Money.parse("USD 100000"));
        bigBoss.hireEmployee(boss);

        for (Employee e : boss.getEmployees()){
            System.out.println(" Coder in " + boss.getName() + " department:\t" + e.getName());
        }
    }
}
