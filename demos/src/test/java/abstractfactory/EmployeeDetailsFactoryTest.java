package abstractfactory;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeDetailsFactoryTest {

    @Test
    public void testHourly() {
        EmployeeDetailsFactory factory = new HourlyEmployeeDetailsFactory();
        PayDetails payDetails = factory.createPayDetails();
        assertThat(payDetails.getClass(), equalTo(HourlyPayDetails.class));
        Bonus bonus = factory.createBonus();
        assertThat(bonus.getClass(), equalTo(HourlyBonus.class));
    }

    @Test
    public void testMonthly() {
        EmployeeDetailsFactory factory = new MonthlyEmployeeDetailsFactory();
        PayDetails payDetails = factory.createPayDetails();
        assertThat(payDetails.getClass(), equalTo(MonthlyPayDetails.class));
        Bonus bonus = factory.createBonus();
        assertThat(bonus.getClass(), equalTo(MonthlyBonus.class));
    }
}
