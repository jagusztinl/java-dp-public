package intro.inheritance;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void testPay() {
        Employee employee = new MonthlyEmployee("John Doe", 100_000);
        double amount = employee.pay();
        assertThat(amount, equalTo(100_000d));
    }

    @Test
    public void testHourlyPay() {
        Employee employee = new HourlyEmployee("John Doe", 100, 50);
        double amount = employee.pay();
        assertThat(amount, equalTo(5000d));
    }
}
