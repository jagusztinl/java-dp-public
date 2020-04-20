package simplefactory;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class PayDetailsFactoryTest {

    @Test
    public void createHourly() {
        PayDetails payDetails = new PayDetailsFactory().create("H;1000;50");
        assertThat(payDetails.getClass(), equalTo(HourlyPayDetails.class));
        assertThat(((HourlyPayDetails) payDetails).getBase(), equalTo(1000d));
        assertThat(((HourlyPayDetails) payDetails).getHours(), equalTo(50));
    }

    @Test
    public void createMonthly() {
        PayDetails payDetails = new PayDetailsFactory().create("M;1000000");
        assertThat(payDetails.getClass(), equalTo(MonthlyPayDetails.class));
        assertThat(((MonthlyPayDetails) payDetails).getMonthlyAmount(), equalTo(1000000d));
    }
}
