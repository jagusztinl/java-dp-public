package adapter;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeesTableModelAdapterTest {

    @Test
    public void testCreate() {
        List<Employee> employees = Arrays.asList(
                new Employee(1L, "John Doe", LocalDate.of(1980, 1, 1)),
                new Employee(2L, "Jane Doe", LocalDate.of(1990, 1, 1))
        );
        EmployeesTableModelAdapter adapter = new EmployeesTableModelAdapter(employees);

        assertThat(adapter.getColumns().get(1), equalTo("Name"));
        assertThat(adapter.getRowCount(), equalTo(2));

        assertThat(adapter.getValue(0, 1), equalTo("John Doe"));
        assertThat(adapter.getValue(1, 0), equalTo("2"));
    }
}
