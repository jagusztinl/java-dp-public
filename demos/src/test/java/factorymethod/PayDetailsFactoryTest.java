package factorymethod;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class PayDetailsFactoryTest {

    @Test
    public void testHourly() {
        PayDetailsFactory factory = new HourlyPayDetailsFactory();
        PayDetails payDetails = factory.create();
        assertThat(payDetails.getClass(), equalTo(HourlyPayDetails.class));
    }

    @Test
    public void testMonthly() {
        PayDetailsFactory factory = new MonthlyPayDetailsFactory();
        PayDetails payDetails = factory.create();
        assertThat(payDetails.getClass(), equalTo(MonthlyPayDetails.class));
    }
}
