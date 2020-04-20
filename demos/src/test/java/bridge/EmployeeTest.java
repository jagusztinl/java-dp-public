package bridge;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void testMonthly() {
        Employee employee = new Employee("John Doe", new MonthlyPayDetails(500),
                new MonthlyBonus(50));
        double amount = employee.pay();
        assertThat(amount, equalTo(550.0));
    }

    @Test
    public void testHourly() {
        Employee employee = new Employee("John Doe", new HourlyPayDetails(50, 5),
                new HourlyBonus(5));
        assertThat(employee.pay(), equalTo(250.0));
    }

    @Test
    public void testHourlyBonus() {
        Employee employee = new Employee("John Doe", new HourlyPayDetails(50, 200),
                new HourlyBonus(200));
        assertThat(employee.pay(), equalTo(10050.0));
    }
}
