import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Boss implements Employee {
    private String name;
    private Double salary;
    private Set<Employee> employees = new HashSet<>();

    public Boss(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean hireEmployee(Employee employee) {
        return employees.add(employee);
    }

    @Override
    public boolean fireEmployee(Employee employee) {
        return employees.remove(employee);
    }
}
