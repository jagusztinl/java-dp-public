package singleton;

import intro.comp.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private static EmployeeDao employeeDao;

    public static synchronized EmployeeDao getInstance() {
        if (employeeDao == null) {
            employeeDao = new EmployeeDao();
        }
        return employeeDao;
    }

    private EmployeeDao() {
    }

    public List<Employee> listEmployees() {
        return new ArrayList<>();
    }

    public void saveEmployee(Employee employee) {
        // ...
    }
}
