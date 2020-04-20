package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<Employee> {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}
