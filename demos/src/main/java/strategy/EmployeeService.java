package strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeService {

    public List<Employee> findByCriteria(List<Employee> employees, Predicate<Employee> predicate) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee: employees) {
            if (predicate.test(employee)) {
                result.add(employee);
            }
        }
        return result;
    }
}
