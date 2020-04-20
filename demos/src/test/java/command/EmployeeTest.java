package command;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void testChangeSalary() {
        Employee employee = new Employee("John Doe", 1000);
        Command command = new ChangeSalaryCommand(200);

        employee.accept(command);

        assertThat(employee.getSalary(), equalTo(1200L));
    }

    @Test
    public void testHistory() {
        Employee employee = new Employee("John Doe", 1000);
        assertThat(employee.getCommands().size(), equalTo(0));

        Command command = new ChangeSalaryCommand(200);
        employee.accept(command);

        assertThat(employee.getCommands().size(), equalTo(1));
    }

    @Test
    public void testChangeName() {
        Employee employee = new Employee("John Doe", 1000);
        Command command = new ChangeNameCommand("Jack Doe");
        employee.accept(command);

        assertThat(employee.getName(), equalTo("Jack Doe"));
    }

    @Test
    public void testUndo() {
        Employee employee = new Employee("John Doe", 1000);
        employee.accept(new ChangeSalaryCommand(200));

        assertThat(employee.getSalary(), equalTo(1200L));

        employee.undo();
        assertThat(employee.getSalary(), equalTo(1000L));
    }
}
