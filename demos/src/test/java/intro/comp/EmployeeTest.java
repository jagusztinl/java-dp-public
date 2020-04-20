package intro.comp;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EmployeeTest {

    @Test
    public void testPay() {
        Employee employee = new Employee("John Doe", new MonthlyPayDetails(100_000));
        double amount = employee.pay();
        assertThat(amount, equalTo(100_000d));
    }

    @Test
    public void testHourlyPay() {
        Employee employee = new Employee("John Doe", new HourlyPayDetails(100, 50));
        double amount = employee.pay();
        assertThat(amount, equalTo(5000d));
    }

    @Test
    public void testChange() {
        Employee employee = new Employee("John Doe", new MonthlyPayDetails(100_000));
        employee.setPayDetails(new HourlyPayDetails(100, 50));
        double amount = employee.pay();
        assertThat(amount, equalTo(5000d));
    }

    @Test
    public void testPayWithStub() {
        Employee employee = new Employee("John Doe", () -> 5);
        double amount = employee.pay();
        assertThat(amount, equalTo(5d));
    }

    @Test
    public void testPayWithMock() {
        PayDetails payDetails = mock(PayDetails.class);
        when(payDetails.pay()).thenReturn(5d);
        Employee employee = new Employee("John Doe", payDetails);
        double amount = employee.pay();
        assertThat(amount, equalTo(5d));
    }
}
