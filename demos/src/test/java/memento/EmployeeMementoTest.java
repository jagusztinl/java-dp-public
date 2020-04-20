package memento;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeMementoTest {

    @Test
    public void testMemento() {
        Employee employee = new Employee("John Doe", 1000);
        Deque<EmployeeMemento> mementos = new ArrayDeque<>();

        mementos.push(employee.save());

        employee.setSalary(1200);

        mementos.push(employee.save());

        employee.setName("Jack Doe");

        assertThat(employee.getName(), equalTo("Jack Doe"));

        employee.restore(mementos.pop());
        assertThat(employee.getName(), equalTo("John Doe"));
        assertThat(employee.getSalary(), equalTo(1200L));

        employee.restore(mementos.pop());
        assertThat(employee.getSalary(), equalTo(1000L));

    }
 }
