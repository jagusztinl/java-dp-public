package prototype;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Employee employee = new Employee("John Doe", new HourlyPayDetails(1000, 50));
        Employee another = (Employee) employee.clone();

        assertThat(another.getName(), equalTo("John Doe"));
        assertThat(another.getPayDetails().pay(), equalTo(50000d));

        Employee third = (Employee) employee.clone();
        ((HourlyPayDetails) third.getPayDetails()).setBase(2000);

        assertThat(another.getPayDetails().pay(), equalTo(50000d));
    }

    @Test
    public void testCopyHourlyPayDetails() {
        HourlyPayDetails details = new HourlyPayDetails(1000, 50);
        HourlyPayDetails another = new HourlyPayDetails(details);

        assertThat(another.getBase(), equalTo(1000d));
        assertThat(another.getHours(), equalTo(50));
    }
}
