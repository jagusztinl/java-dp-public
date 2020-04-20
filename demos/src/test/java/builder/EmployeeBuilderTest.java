package builder;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeBuilderTest {

    @Test
    public void testBuild() {
        Employee employee = new EmployeeBuilder().setName("John Doe")
                .setBase(100).setHours(50).build();
        assertThat(employee.getName(), equalTo("John Doe"));
        assertThat(employee.getPayDetails().pay(), equalTo(5000d));

    }

    @Test(expected = IllegalStateException.class)
    public void testBuildMissingName() {
        new EmployeeBuilder()
                .setBase(100).setHours(50).build();
    }

    @Test
    public void testBuildDefaultBase() {
        Employee employee = new EmployeeBuilder()
                .setName("John Doe")
                .setHours(50).build();
        assertThat(employee.getName(), equalTo("John Doe"));
        assertThat(employee.getPayDetails().pay(), equalTo(40000d));

    }
}
