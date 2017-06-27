import lombok.Getter;
import lombok.Setter;
import org.joda.money.Money;

import java.util.Set;

@Getter
public class Developer implements Employee {
    private String name;
    private Money salary;
    @Setter
    private Employee boss;

    public Developer(String name, Money salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean hireEmployee(Employee employee) {
        String msg = "Coders cannot hire anyone";
        throw new UnsupportedOperationException(msg);
    }

    @Override
    public boolean fireEmployee(Employee employee) {
        String msg = "Coders cannot fire anyone";
        throw new UnsupportedOperationException(msg);
    }

    @Override
    public Set<Employee> getEmployees() {
        String msg = "Coder doesn't have employees";
        throw new UnsupportedOperationException(msg);
    }

}
