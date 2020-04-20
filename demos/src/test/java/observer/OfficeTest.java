package observer;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class OfficeTest {

    @Test
    public void testObserver() {
        Employee employee = new Employee("John Doe", 1000);
        Office office = new Office();
        employee.register(office);

        employee.setName("Jack Doe");

        assertThat(office.getChanges(), equalTo(Arrays.asList("John Doe -> Jack Doe")));

        employee.remove(office);

        employee.setName("John Doe");

        assertThat(office.getChanges().size(), equalTo(1));
    }
}
