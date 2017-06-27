import java.util.Set;

public interface Employee {
    boolean hireEmployee(Employee employee);
    boolean fireEmployee(Employee employee);
    Set<Employee> getEmployees();
    String getName();
    Double getSalary();
}
