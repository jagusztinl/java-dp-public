package strategy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeServiceTest {

    @Test
    public void testFind() {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 1000),
                new Employee("Jane Doe", 2000),
                new Employee("Jack Doe", 3000)
        );

        List<Employee> result =
                new EmployeeService().findByCriteria(employees, employee -> employee.getName().startsWith("Jane"));

        assertThat(result.size(), equalTo(1));
        assertThat(result.get(0).getName(), equalTo("Jane Doe"));
    }

    @Test
    public void testFindBySalary() {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 1000),
                new Employee("Jane Doe", 2000),
                new Employee("Jack Doe", 3000)
        );

        List<Employee> result =
                new EmployeeService().findByCriteria(employees, employee -> employee.getSalary() >= 2000);
        assertThat(result.size(), equalTo(2));
        assertThat(result.get(1).getName(), equalTo("Jack Doe"));
    }
}
