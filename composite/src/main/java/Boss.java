import lombok.Getter;
import lombok.Setter;
import org.joda.money.Money;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Boss implements Employee {
    private String name;
    private Money salary;
    private Set<Employee> employees = new HashSet<>();

    @Setter
    private Employee boss;

    public Boss(String name, Money salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean hireEmployee(Employee employee) {
        boolean employmentResult = employees.add(employee);
        if(employmentResult){
            employee.setBoss(this);
        }
        return employmentResult;
    }

    @Override
    public boolean fireEmployee(Employee employee) {
        boolean firingResult = employees.remove(employee);
        if(firingResult){
            employee.setBoss(null);
        }
        return firingResult;
    }

}
