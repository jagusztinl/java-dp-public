package proxy;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class DynamicProxyTest {

    @Test
    public void hasRole() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeService securityService = SecurityInvocationHandler.createSecurityEmployeeService(
                (s) -> true,
                employeeService
        );
        securityService.addEmployee(new Employee("John Doe"));
        List<Employee> result = securityService.listEmployee();

        assertThat(result.size(), equalTo(1));
        assertThat(result.get(0).getName(), equalTo("John Doe"));
    }

    @Test(expected = SecurityException.class)
    public void hasNoRole() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeService securityService = SecurityInvocationHandler.createSecurityEmployeeService(
                (s) -> false,
                employeeService
        );
        securityService.addEmployee(new Employee("John Doe"));
    }
}
