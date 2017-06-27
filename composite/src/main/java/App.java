public class App {
    public static void main(String[] args) {
        Employee boss = new Boss("Boss", 100_000.);
        Employee javaCoder = new Developer("Java Coder", 10_000.);
        Employee cppCoder = new Developer("Cpp coder", 15_000.);

        boss.hireEmployee(javaCoder);
        boss.hireEmployee(cppCoder);

        Employee bigBoss = new Boss("Big Boss", 1_000_000.);
        bigBoss.hireEmployee(boss);

        for (Employee e : boss.getEmployees()){
            System.out.println(" Coder in " + boss.getName() + " department:\t" + e.getName());
        }
    }
}
