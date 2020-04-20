package templatemethod;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class PayDetailsTest {

    @Test
    public void monthlyTest() {
        PayDetails monthlyPayDetails = new MonthlyPayDetails(1000);

        assertThat(monthlyPayDetails.yearlySalary(), equalTo(12 * 1000L));
    }

    @Test
    public void hourlyTest() {
        PayDetails houryPayDetails = new HourlyPayDetails(100,
                new long[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
        assertThat(houryPayDetails.yearlySalary(), equalTo(12 * 100L));
    }
}
