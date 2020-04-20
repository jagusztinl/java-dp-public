package decorator;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class UnmodifiableEmployeeTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testModify() {
        Employee employee = new EmployeeImpl(1, "John Doe");
        Employee decorated = new UnmodifiableEmployee(employee);

        assertThat(decorated.getName(), equalTo("John Doe"));
        decorated.setName("Jack Doe");
    }
}
