package singleton;

import intro.comp.Employee;

import java.util.List;

public class EmployeeService {

    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> listEmployees() {
        return employeeDao.listEmployees();
    }

    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }
}
